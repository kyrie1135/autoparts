package com.mixone.portal.admin.org.service.impl;

import com.mixone.portal.admin.org.mapper.UserLoginMapper;
import com.mixone.portal.admin.org.model.UserLogin;
import com.mixone.portal.admin.org.model.UserLoginExample;
import com.mixone.portal.admin.org.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;

    @Override
    public long countByExample(UserLoginExample example) {
        return userLoginMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserLoginExample example) {
        return userLoginMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(String partyId) {
        return userLoginMapper.deleteByPrimaryKey(partyId);
    }

    @Override
    public int insert(UserLogin record) {
        return userLoginMapper.insert(record);
    }

    @Override
    public int insertSelective(UserLogin record) {
        return userLoginMapper.insertSelective(record);
    }

    @Override
    public List<UserLogin> selectByExample(UserLoginExample example) {
        return userLoginMapper.selectByExample(example);
    }

    @Override
    public UserLogin selectByPrimaryKey(String partyId) {
        return userLoginMapper.selectByPrimaryKey(partyId);
    }

    @Override
    public int updateByExampleSelective(UserLogin record, UserLoginExample example) {
        return userLoginMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(UserLogin record, UserLoginExample example) {
        return userLoginMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserLogin record) {
        return userLoginMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserLogin record) {
        return userLoginMapper.updateByPrimaryKey(record);
    }

    @Override
    public UserLogin findByLoginId(String userLoginId) {
        UserLogin userLogin=null;
        UserLoginExample example =new UserLoginExample();

        //1 判断登录账号
        example.createCriteria()
                .andUserLoginIdEqualTo(userLoginId)
                .andCurrentStatusEqualTo("0");
        List<UserLogin> userLogins = userLoginMapper.selectByExample(example);
        if(null != userLogins && 0 != userLogins.size()){
            userLogin = userLogins.get(0);
        }else{
            //2 判断手机号码
            example.clear();
            example.createCriteria()
                    .andMobileEqualTo(userLoginId)
                    .andCurrentStatusEqualTo("0");
            userLogins = userLoginMapper.selectByExample(example);
            if(null != userLogins && 0 != userLogins.size()) {
                userLogin = userLogins.get(0);
            }else{
                //3 判断邮箱
                example.clear();
                example.createCriteria()
                        .andEmailEqualTo(userLoginId)
                        .andCurrentStatusEqualTo("0");
                userLogins = userLoginMapper.selectByExample(example);
                if(null != userLogins && 0 != userLogins.size()) {
                    userLogin = userLogins.get(0);
                }
            }
        }


        return userLogin;
    }

}
