package com.alan.services.impl;

import com.alan.mapper.SchedulingMapper;
import com.alan.pojo.PageBean;
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

    @Override
    public void deleteByCode(String code) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SchedulingMapper mapper = sqlSession.getMapper(SchedulingMapper.class);

        mapper.deleteByCode(code);

        sqlSession.commit();
        sqlSession.close();

    }

    @Override
    public PageBean<Scheduling> selectByPage(int currentPage, int pageSize) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SchedulingMapper mapper = sqlSession.getMapper(SchedulingMapper.class);

        //到 当前页总数
        int begin = currentPage * pageSize;

        //到上一页总数
        int size = (currentPage -1 ) * pageSize;

        //查询当前页集合
        List<Scheduling> rows = mapper.selectByPage(begin, size);

        //查询总记录数
        int totalCount = mapper.selectTotalCount();

        PageBean<Scheduling> pageBean = new PageBean<>();

        //封装pageBean对象
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);

        sqlSession.close();

        return pageBean;

    }


    @Override
    public PageBean<Scheduling> selectByPageAndCondition(int currentPage, int pageSize,Scheduling scheduling) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SchedulingMapper mapper = sqlSession.getMapper(SchedulingMapper.class);

        //到 当前页总数
        int begin = currentPage * pageSize;

        //到上一页总数
        int size = (currentPage -1 ) * pageSize;

        //查询当前页集合
        List<Scheduling> rows = mapper.selectByPageANDCondition(begin, size,scheduling);

        //查询总记录数
        int totalCount = mapper.selectConditionTotalCount(scheduling);

        PageBean<Scheduling> pageBean = new PageBean<>();

        //封装pageBean对象
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);

        sqlSession.close();

        return pageBean;
    }

    public List<Scheduling> selectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        SchedulingMapper mapper = sqlSession.getMapper(SchedulingMapper.class);

        List<Scheduling> schedulings = mapper.selectAll();

        sqlSession.close();

        return schedulings;
    }


}
