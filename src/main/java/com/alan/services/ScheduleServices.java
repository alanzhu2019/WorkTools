package com.alan.services;

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
     * 更新排程
     * @param code
     */
    void updateByCode(String code);
}
