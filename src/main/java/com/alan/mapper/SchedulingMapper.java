package com.alan.mapper;

import com.alan.pojo.Scheduling;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchedulingMapper {

    Scheduling selectByCode(String code);


    List<Scheduling> selectAll();


    void updateSchedulingByCode(String code);

    void deleteByCode(String code);

    //分页查询
    List<Scheduling> selectByPage(@Param("begin") int begin , @Param("size") int size);

    //查询总记录数
    int selectTotalCount();


    //条件分页查询
    List<Scheduling> selectByPageANDCondition(@Param("begin") int begin , @Param("size") int size,@Param("scheduling")Scheduling scheduling);


    //条件查询总记录数
    int selectConditionTotalCount(Scheduling scheduling);
}
