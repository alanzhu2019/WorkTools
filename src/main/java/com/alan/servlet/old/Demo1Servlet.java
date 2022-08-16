package com.alan.servlet.old;

import com.alan.pojo.Scheduling;
import com.alan.services.impl.SchedulingService;
import com.alibaba.fastjson.JSON;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/demo1Servlet")
public class Demo1Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SchedulingService schedulingService = new SchedulingService();


        BufferedReader reader = request.getReader();
        String s = reader.readLine();


        String code = "YDMY19B1803A-001";
        Scheduling scheduling = schedulingService.selectSchedulingByCode(code);

        String toJSONString = JSON.toJSONString(scheduling);

        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(toJSONString);


//        System.out.println("开始更新");
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        schedulingService.updateByCode(code);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           this.doGet(request,response);
    }
}
