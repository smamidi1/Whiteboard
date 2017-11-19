package controllers;

import java.io.*;
import dao.Userdao;

import javax.servlet.annotation.WebServlet;


/**
 * Created by Dhruva Juloori on 11/16/2017.
 */
public class Usercontroller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Userdao dao1 = new Userdao();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String result = dao1.finduser(username,password);
        if(result.equals("Professor")){
            out.println("Success");
        }else if(result == "Student"){

        }else{
            out.println("failed");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
