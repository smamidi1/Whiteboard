package controllers;

import java.io.*;
import dao.Userdao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;


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
        HttpSession session = request.getSession();
        if (result.equals("Professor")) {
            session.setAttribute("username",username);
            session.setAttribute("password",password);
            response.sendRedirect("index1.jsp");
        } else if (result.equals("Student")) {
            response.sendRedirect("index.jsp");
        } else {
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Login failed');");
            out.println("location='index.jsp';");
            out.println("</script>");

           }
       }
    }
