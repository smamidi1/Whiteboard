package controllers;

import dao.Userdao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dhruva Juloori on 11/18/2017.
 */

public class Signupcontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String usertype = request.getParameter("usertype");
        if((username.length() == 0) || (password.length() == 0) || (usertype.length() == 0)){
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Fields cannot be empty!');");
            out.println("location='signup.jsp';");
            out.println("</script>");
        }else {
            Userdao dao2 = new Userdao();
            String result = dao2.createUser(username, password, usertype);
            if (result.equals("Success")){
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Registration failed!');");
                out.println("location='signup.jsp';");
                out.println("</script>");
            }
        }
    }
}
