package com.zephyr.service.dao;

import com.zephyr.common.query.UserInfoQuery;
import com.zephyr.service.dataobject.UserInfoDO;
import com.zephyr.service.mapper.UserInfoMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserInfoDAO {

    @Resource
    private UserInfoMapper userInfoMapper;


    public List<UserInfoDO> getList(UserInfoQuery userInfoQuery){
        return userInfoMapper.getList(userInfoQuery);
    }

}
