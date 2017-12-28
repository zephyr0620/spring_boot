package com.zephyr;


import com.zephyr.common.query.UserInfoQuery;
import com.zephyr.service.dataobject.UserInfoDO;
import com.zephyr.service.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class UserInfoMapperTest implements Serializable {

    @Resource
    private UserInfoMapper userInfoMapper;


    @Test
    public void addOne() {

        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setUsername("user1");
        userInfoDO.setPassword("password1");

        int one = userInfoMapper.createOne(userInfoDO);
        if(one > 1){

        }
//      assertTrue(studentService.likeName("小明2").size() > 0);
    }

    @Test
    public void getList() {

        UserInfoQuery userInfoQuery = new UserInfoQuery();


        List<UserInfoDO> list = userInfoMapper.getList(userInfoQuery);

        userInfoQuery.setId(3L);

        List<UserInfoDO> list2 = userInfoMapper.getList(userInfoQuery);
        if(CollectionUtils.isEmpty(list2)){

        }
//      assertTrue(studentService.likeName("小明2").size() > 0);
    }

    @Test
    public void updateOne() {

        UserInfoDO userInfoDO = new UserInfoDO();
        userInfoDO.setUsername("111111");
        userInfoDO.setPassword("222222");
        userInfoDO.setId(1L);


        int update = userInfoMapper.update(userInfoDO);


        assertTrue(update > 0);
    }


}
