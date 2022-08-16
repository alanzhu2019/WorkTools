package com.alan.services.impl;

import com.alan.mapper.SchedulingMapper;
import com.alan.pojo.Scheduling;
import com.alan.services.ScheduleServices;
import com.alan.util.SqlFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class SchedulingService implements ScheduleServices {

    private SqlSessionFactory sqlSessionFactory = SqlFactoryUtils.getSqlSessionFactory();

    public Scheduling selectSchedulingByCode(String code){

        SqlSession sqlSession = sqlSessionFactory.openSession();

        SchedulingMapper mapper = sqlSession.getMapper(SchedulingMapper.class);

        Scheduling scheduling = mapper.selectByCode(code);
        System.out.println(scheduling);

        sqlSession.close();
        return scheduling;

    }

    public void updateByCode(String code){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SchedulingMapper mapper = sqlSession.getMapper(SchedulingMapper.class);

        mapper.updateSchedulingByCode(code);

        sqlSession.commit();
        sqlSession.close();
    }

    public List<Scheduling> selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SchedulingMapper mapper = sqlSession.getMapper(SchedulingMapper.class);

        List<Scheduling> schedulings = mapper.selectAll();

        sqlSession.close();

        return schedulings;
    }
}
