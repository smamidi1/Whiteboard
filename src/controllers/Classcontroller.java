package controllers;

import dao.Classesdao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dhruva Juloori on 11/26/2017.
 */
@WebServlet(name = "classcontroller")
public class Classcontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String classid = request.getParameter("courseId");
        String classname = request.getParameter("courseName");
        Classesdao dao1 = new Classesdao();
        if(request.getParameter("add")!=null){
            String result = dao1.addClass(classid,classname,username);
            if (result.equals("Inserted")){
                session.setAttribute("classid",classid);
                session.setAttribute("classname",classname);
                response.sendRedirect("courses.jsp");
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Inserting failed!');");

                out.println("</script>");
                response.sendRedirect("courses.jsp");
            }
        }else if(request.getParameter("RemoveClass")!=null){
            Classesdao dao3 = new Classesdao();
            String result = dao3.removeClass(classid);
            if (result.equals("Removed")){
                response.sendRedirect("courses.jsp");
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Removing failed!');");

                out.println("</script>");
                response.sendRedirect("courses.jsp");
            }
        }else if(request.getParameter("EditClass")!=null){
            Classesdao dao2 = new Classesdao();
            String result = dao2.editClass(classid,classname,username);
            if (result.equals("Edited")){
                session.setAttribute("classid",classid);
                session.setAttribute("classname",classname);
                response.sendRedirect("courses.jsp");

            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Editing failed!');");
                out.println("</script>");
                response.sendRedirect("courses.jsp");
            }
        }
    }
}
