package controllers;

import java.io.*;
import dao.Userdao;


/**
 * Created by Dhruva Juloori on 11/16/2017.
 */
public class Usercontroller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       /*System.out.println("hi");
       String username = request.getParameter("username");
       String password = request.getParameter("password");
       System.out.println(username + " " + password);
       Userdao dao1 = new Userdao();
       String result = dao1.finduser(username,password);
       System.out.println(result);
       if(result == "Professor"){
           response.setContentType("text/html");
           PrintWriter out = response.getWriter();
           out.println("Success");
       }else{
           System.out.println("failed");
       }*/
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
