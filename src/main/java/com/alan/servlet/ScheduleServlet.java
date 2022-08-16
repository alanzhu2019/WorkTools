package com.alan.servlet;

import com.alan.pojo.PageBean;
import com.alan.pojo.Scheduling;
import com.alan.services.impl.SchedulingService;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/schedule/*")
public class ScheduleServlet extends BaseServlet {

    private SchedulingService schedulingService = new SchedulingService();


    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        List<Scheduling> schedulings = schedulingService.selectAll();

        String toJSONSchedulings = JSON.toJSONString(schedulings);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONSchedulings);

    }

    /**
     * 分页查询
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void selectByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        //接收参数当前页码和每页条数
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        PageBean<Scheduling> schedulingPageBean = schedulingService.selectByPage(currentPage, pageSize);

        //转换为JSON数据
        String toJSONSchedulings = JSON.toJSONString(schedulingPageBean);

        //发数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONSchedulings);

    }


    public void selectSchedulingByCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader reader = request.getReader();

        String codeString = reader.readLine();

        Scheduling scheduling = schedulingService.selectSchedulingByCode(codeString);

        String s = JSON.toJSONString(scheduling);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(s);
    }

    public void updateByCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader reader = request.getReader();

        String codeString = reader.readLine();

        schedulingService.updateByCode(codeString);

        response.getWriter().write("success");
    }

    public void deleteByCode(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        BufferedReader reader = request.getReader();

        String codeString = reader.readLine();

        schedulingService.deleteByCode(codeString);

        response.getWriter().write("success");
    }

}
