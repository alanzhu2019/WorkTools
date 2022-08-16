package com.alan.services;

import com.alan.pojo.PageBean;
import com.alan.pojo.Scheduling;

import java.util.List;

public interface ScheduleServices {

    /**
     * 查询所有
     * @return
     */
    List<Scheduling> selectAll();

    /**
     * 根据code查询单个排程
     * @param code
     * @return
     */
    Scheduling selectSchedulingByCode(String code);

    /**
     * 更新排程为已完工
     * @param code
     */
    void updateByCode(String code);

    /**
     * 删除排程
     * @param code
     */
    void deleteByCode(String code);

    /**
     * 分页查询
     * @param currentPage 当前页码
     * @param pageSize   每页展示条数
     * @return
     */
    PageBean<Scheduling> selectByPage(int currentPage,int pageSize);
}
