package com.chiclaim.controller;

import com.alibaba.fastjson.JSON;
import com.chiclaim.bean.ResponseModel;
import com.chiclaim.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json; charset=utf-8");

        // test retrofit body null
        // resp.setStatus(204);

        String username = req.getParameter("username");
        String mobile = req.getParameter("mobile");
        if (username == null || username.isEmpty()) {
            ResponseModel responseModel = new ResponseModel();
            responseModel.setStatus(1);
            responseModel.setMessage("用户名不能为空");
            resp.getWriter().print(JSON.toJSON(responseModel));
            return;
        }

        if (mobile == null || mobile.isEmpty()) {
            ResponseModel responseModel = new ResponseModel();
            responseModel.setStatus(1);
            responseModel.setMessage("手机号不能为空");
            resp.getWriter().print(JSON.toJSON(responseModel));
            return;
        }

        ResponseModel<User> responseModel = new ResponseModel<>();
        responseModel.setStatus(0);
        responseModel.setMessage("注册成功");
        User user = new User();
        user.setUsername(username);
        user.setMobile(mobile);
        responseModel.setData(user);
        resp.getWriter().print(JSON.toJSON(responseModel));
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
