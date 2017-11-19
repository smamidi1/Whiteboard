package controllers;

import dao.Userdao;
import models.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dhruva Juloori on 11/18/2017.
 */
@WebServlet(name = "Signupcontroller")
public class Signupcontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usertype = request.getParameter("usertype");
        Userdao dao2 = new Userdao();
        dao2.createUser(username,password,usertype);
    }

}
