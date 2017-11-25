package controllers;

import java.io.*;
import dao.Userdao;

import javax.servlet.annotation.WebServlet;


/**
 * Created by Dhruva Juloori on 11/16/2017.
 */
public class Usercontroller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Userdao dao1 = new Userdao();
        String result = dao1.findUser(username, password);
        if (result.equals("Professor")) {
            out.println("Success");
        } else if (result.equals("Student")) {
            out.println("Success and Hi!");
        } else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Login failed');");
            out.println("location='index.jsp';");
            out.println("</script>");
            //out.println(result);
           }
       }
    }
