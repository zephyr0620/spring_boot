package com.zephyr.service.mapper;

import com.zephyr.common.query.UserInfoQuery;
import com.zephyr.service.dataobject.UserInfoDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoDO, Long, UserInfoQuery>{
}
