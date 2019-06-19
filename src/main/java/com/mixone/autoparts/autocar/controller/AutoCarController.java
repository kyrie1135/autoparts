package com.mixone.autoparts.autocar.controller;

import com.mixone.autoparts.autocar.model.AutoCar;
import com.mixone.autoparts.autocar.model.AutoCarExample;
import com.mixone.autoparts.autocar.service.AutoCarService;
import com.mixone.portal.admin.util.IdUtil;
import com.mixone.portal.admin.util.UserLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.List;

@Controller
public class AutoCarController {

    @Autowired
    AutoCarService autoCarService;

    @RequestMapping("/autocarlist")
    public String autocarlist(){
        return "/jsp/app/autocarlist";
    }

    @RequestMapping(value = "/autocars", method = RequestMethod.GET)
    public @ResponseBody
    Object getAutoCars(){

        AutoCarExample example = new AutoCarExample();
        AutoCarExample.Criteria criteria = example.createCriteria();

        criteria.andIsDelEqualTo(0);

        List<AutoCar> autoCars=autoCarService.selectByExample(example);
        return autoCars;
    }

    @RequestMapping(value = "/autocar", method = RequestMethod.POST ,produces = "application/json")
    public @ResponseBody
    AutoCar addCar(@RequestBody AutoCar autoCar, Model model, HttpServletRequest request) {

        autoCar.setAutocarId(IdUtil.nextId().toString());
        autoCar.setIsDel(0);
        autoCar.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        autoCar.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        autoCar.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        autoCar.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());

        autoCarService.insert(autoCar);

        return autoCar;
    }

    //
    @RequestMapping(value = "/autocar", method = RequestMethod.GET)
    public @ResponseBody
    Object autoCar(AutoCar autoCar) {

        AutoCarExample example = new AutoCarExample();
        AutoCarExample.Criteria criteria =example.createCriteria();

        criteria.andIsDelEqualTo(0);

        if(autoCar.getAutocarId() !=null ){
            criteria.andAutocarNoEqualTo(autoCar.getAutocarId());
        }
        if(autoCar.getAutocarNo() !=null ){
            criteria.andAutocarNoEqualTo(autoCar.getAutocarNo());
        }
        List<AutoCar> autoCars = autoCarService.selectByExample(example);

        if (autoCars != null && autoCars.size() !=0) {
            for (AutoCar ac : autoCars) {
                autoCar = ac;
            }
        }else{
            autoCar=new AutoCar();
        }
        return autoCar;
    }


    //修改检查
    @RequestMapping(value = "/autocar/check", method = RequestMethod.GET)
    public @ResponseBody
    Object checkautoCar(AutoCar autoCar) {

        AutoCarExample example = new AutoCarExample();
        AutoCarExample.Criteria criteria =example.createCriteria();

        //检索 车牌号一样 id不一样, 如果有结果-->则车牌号有重复
        if(autoCar.getAutocarId() !=null ){
            criteria.andAutocarIdNotEqualTo(autoCar.getAutocarId());
        }
        if(autoCar.getAutocarNo() !=null ){
            criteria.andAutocarNoEqualTo(autoCar.getAutocarNo());
        }
        List<AutoCar> autoCars = autoCarService.selectByExample(example);

        if (autoCars != null && autoCars.size() !=0) {
            for (AutoCar ac : autoCars) {
                autoCar = ac;
            }
        }else{
            autoCar=new AutoCar();
        }
        return autoCar;
    }


    //删除
    @RequestMapping(value = "/autocar/{autocarId}",method= RequestMethod.DELETE)
    public @ResponseBody
    Object deleteRoles(@PathVariable("autocarId") String autocarId, HttpServletRequest request){
        AutoCar autoCar=new AutoCar();
        autoCar.setAutocarId(autocarId);
        autoCar.setIsDel(1);

        autoCarService.updateByPrimaryKeySelective(autoCar);
        //userLoginService.deleteByPrimaryKey(userId);
        return "200";
    }

    @RequestMapping(value = "/autocar",method= RequestMethod.PUT,produces = "application/json")
    public @ResponseBody
    Object editCar(@RequestBody AutoCar autocar, HttpServletRequest request){

        autocar.setIsDel(0);
        autocar.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        autocar.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        autoCarService.updateByPrimaryKeySelective(autocar);
        return autocar;
    }

    @RequestMapping(value = "/autocar",method= RequestMethod.DELETE,produces = "application/json")
    public @ResponseBody
    Object deleteCar(@RequestBody AutoCar autocar, HttpServletRequest request){
        autocar.setIsDel(1);
        autocar.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        autocar.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        autoCarService.updateByPrimaryKeySelective(autocar);
        return "200";
    }

}
