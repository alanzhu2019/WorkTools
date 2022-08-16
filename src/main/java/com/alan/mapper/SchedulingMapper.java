package com.alan.mapper;

import com.alan.pojo.Scheduling;

import java.util.List;

public interface SchedulingMapper {

    Scheduling selectByCode(String code);


    List<Scheduling> selectAll();


    void updateSchedulingByCode(String code);

    void deleteByCode(String code);

}
