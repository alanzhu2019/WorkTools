package com.alan.servlet.old;

import com.alan.pojo.Scheduling;
import com.alan.services.impl.SchedulingService;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "selectSchedulingAllServlet", value = "/selectSchedulingAllServlet")
public class SelectSchedulingAllServlet extends HttpServlet {
    private SchedulingService schedulingService = new SchedulingService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Scheduling> schedulings = schedulingService.selectAll();

        String toJSONSchedulings = JSON.toJSONString(schedulings);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONSchedulings);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
