package com.zephyr.service.mapper;

import com.zephyr.common.query.BaseQuery;
import com.zephyr.service.dataobject.BaseDO;

import java.util.List;

public interface BaseMapper<T extends BaseDO, ID, Q extends BaseQuery> {
    /**
     * 获取一条记录
     *
     * @param q
     * @return
     */
    T getOne(Q q);

    /**
     * 返回根据条件分页筛选的列表
     *
     * @param q
     * @return
     */
    List<T> getList(Q q);

    /**
     * T返回成功对应的id字段值
     *
     * @param entity
     * @return
     */
    int createOne(T entity);

    /**
     * 返回影响的行数
     *
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 返回删除的行数
     *
     * @param id
     * @return
     */
    int delete(ID id);

    /**
     * 多个条件删除数据
     *
     * @param q
     * @return
     */
    int deleteByQuery(Q q);

    /**
     * 获取总数
     *
     * @param q
     * @return
     */
    int count(Q q);
}
