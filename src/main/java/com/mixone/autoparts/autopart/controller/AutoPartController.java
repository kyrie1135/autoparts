package com.mixone.autoparts.autopart.controller;

import com.mixone.autoparts.autocar.model.AutoCar;
import com.mixone.autoparts.autocar.model.AutoCarExample;
import com.mixone.autoparts.autocar.service.AutoCarService;
import com.mixone.autoparts.autopart.model.AutoPart;
import com.mixone.autoparts.autopart.model.AutoPartExample;
import com.mixone.autoparts.autopart.service.AutoPartService;
import com.mixone.portal.admin.util.IdUtil;
import com.mixone.portal.admin.util.UserLoginUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class AutoPartController {

    @Autowired
    AutoPartService autoPartService;

    @Autowired
    AutoCarService autoCarService;

    @RequestMapping("toaddautopart")
    public String toAddAutoParts(Model model, HttpServletRequest request){

        List<AutoCar> autoCars= autoCarService.selectByExample(new AutoCarExample());
        model.addAttribute("autoCars",autoCars);
        return "/jsp/app/autopartadd";
    }

    @RequestMapping("saveautopart")
    public String saveAutoParts(Model model, HttpServletRequest request){
        String autocarNo = request.getParameter("autocarNo");
        String purchaseTime = request.getParameter("purchaseTime");
        String purchaser = request.getParameter("purchaser");

            for(int i=1 ; i<=5;i++){
                String autopartName = request.getParameter("autopartName"+i);
                String autopartPrice = request.getParameter("autopartPrice"+i);
                String autopartQuantity = request.getParameter("autopartQuantity"+i);
                String autopartTotal = request.getParameter("autopartTotal"+i);
                if(null != autopartPrice && !"".equalsIgnoreCase(autopartPrice) &&
                        null != autopartQuantity && !"".equalsIgnoreCase(autopartQuantity)){
                    try {
                    AutoPart autoPart=new AutoPart();
                    autoPart.setAutopartId(IdUtil.nextId().toString());
                    autoPart.setAutocarNo(autocarNo);
                    autoPart.setAutopartName(autopartName);
                    autoPart.setAutopartPrice(Double.parseDouble(autopartPrice));
                    autoPart.setAutopartQuantity(Integer.parseInt(autopartQuantity));
                    autoPart.setAutopartTotal(Double.parseDouble(autopartTotal));
                    autoPart.setPurchaser(purchaser);

                    autoPart.setIsDel(0);

                    if(null != purchaseTime && !"".equalsIgnoreCase(purchaseTime)){
                        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        autoPart.setPurchaseTime(dateFormat.parse(purchaseTime));
                    }else{
                        autoPart.setPurchaseTime(new Timestamp(System.currentTimeMillis()));
                    }


                    autoPart.setCreatedTime(new Timestamp(System.currentTimeMillis()));
                    autoPart.setCreatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
                    autoPart.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
                    autoPart.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());

                    autoPartService.insert(autoPart);

                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }


        return "redirect:autopartlist";
    }

    @RequestMapping("/autopartlist")
    public String autopartList(Model model, HttpServletRequest request){

        List<AutoCar> autoCars= autoCarService.selectByExample(new AutoCarExample());
        model.addAttribute("autoCars",autoCars);


        String autocarNo = request.getParameter("autocarNo");
        String autopartName = request.getParameter("autopartName");
        String purchaseTime1 = request.getParameter("purchaseTime1");
        String purchaseTime2 = request.getParameter("purchaseTime2");

//        List<AutoCar> autoCars= autoCarService.selectByExample(new AutoCarExample());
//        model.addAttribute("autoCars",autoCars);

        model.addAttribute("autocarNo",autocarNo);
        model.addAttribute("autopartName",autopartName);
        model.addAttribute("purchaseTime1",purchaseTime1);
        model.addAttribute("purchaseTime2",purchaseTime2);

        return "/jsp/app/autopartlist";
    }

    @RequestMapping(value = "/autopart", method = RequestMethod.GET)
    public @ResponseBody
    Object autopart(Model model, HttpServletRequest request){

        String autocarNo = request.getParameter("autocarNo");
        String autopartName = request.getParameter("autopartName");
        String purchaseTime1 = request.getParameter("purchaseTime1");
        String purchaseTime2 = request.getParameter("purchaseTime2");


        AutoPartExample example = new AutoPartExample();

        AutoPartExample.Criteria criteria=example.createCriteria();



        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        if(null != autocarNo && !"".equalsIgnoreCase(autocarNo)){
            criteria.andAutocarNoEqualTo(autocarNo);
        }

        if(null != autopartName && !"".equalsIgnoreCase(autopartName)){
            criteria.andAutopartNameEqualTo(autopartName);
        }

        if(null != purchaseTime1 && !"".equalsIgnoreCase(purchaseTime1)){
            try {
                criteria.andPurchaseTimeGreaterThanOrEqualTo(dateFormat.parse(purchaseTime1));
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        if(null != purchaseTime2 && !"".equalsIgnoreCase(purchaseTime2)){
            try {
                criteria.andPurchaseTimeLessThanOrEqualTo(dateFormat.parse(purchaseTime2));
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        criteria.andIsDelEqualTo(0);

        List<AutoPart> autoParts = autoPartService.selectByExample(example);

        return autoParts;

    }


    @RequestMapping("tosearch")
    public String tosearch(Model model, HttpServletRequest request){
        List<AutoCar> autoCars= autoCarService.selectByExample(new AutoCarExample());
        model.addAttribute("autoCars",autoCars);
        return "/jsp/app/autopartsearch";
    }



    @RequestMapping(value = "/autopart",method= RequestMethod.DELETE,produces = "application/json")
    public @ResponseBody
    Object deleteAutopart(@RequestBody AutoPart autopart, HttpServletRequest request){
        autopart.setIsDel(1);
        autopart.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        autopart.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        autoPartService.updateByPrimaryKeySelective(autopart);
        return "200";
    }


    @RequestMapping(value = "/autopart",method= RequestMethod.PUT,produces = "application/json")
    public @ResponseBody
    Object editAutopart(@RequestBody AutoPart autopart, HttpServletRequest request){

        autopart.setIsDel(0);
        autopart.setLastUpdatedUserLogin(UserLoginUtil.getUserLogin(request).getUserLoginId());
        autopart.setLastUpdatedTime(new Timestamp(System.currentTimeMillis()));
        autoPartService.updateByPrimaryKeySelective(autopart);
        return autopart;
    }
}
