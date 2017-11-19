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
        if((username.length() > 0) && (password.length() > 0)){
            Userdao dao1 = new Userdao();
            String result = dao1.finduser(username, password);
            if (result.equals("Professor")) {
                out.println("Success");
            } else if (result == "Student") {

            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Login failed');");
                out.println("location='index.jsp';");
                out.println("</script>");
            }
        }else{
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Fields cannot be empty!');");
            out.println("location='index.jsp';");
            out.println("</script>");
        }
    }
}
