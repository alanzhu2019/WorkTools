package com.alan.servlet;

import com.alan.pojo.Scheduling;
import com.alan.services.impl.SchedulingService;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
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

}
