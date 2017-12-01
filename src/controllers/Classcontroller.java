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
        //String password = (String) session.getAttribute("password");
     //   if (request.getParameter("AddClass") != null) {
            String classid = request.getParameter("courseId");
            String classname = request.getParameter("courseName");
            Classesdao dao1 = new Classesdao();
            String result = dao1.addClass(classid,classname,username);
            if (result.equals("Inserted")){
                session.setAttribute("classid",classid);
                session.setAttribute("classname",classname);
                response.sendRedirect("courses.jsp");
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Inserting failed!');");
                out.println("location='Classes_for_Professors.jsp';");
                out.println("</script>");
            }
        //}
        /* if(request.getParameter("RemoveClass")!=null){
            String classid = request.getParameter("Class-ID");
            String classname = request.getParameter("Class-Name");
            Classesdao dao3 = new Classesdao();
            String result = dao3.removeClass(classid);
            if (result.equals("Removed")){
                //session.setAttribute("classid",classid);
                //session.setAttribute("classname",classname);
                //response.sendRedirect("assignments.jsp");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Removing Success!');");
                out.println("location='Classes_for_Professors.jsp';");
                out.println("</script>");
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Removing failed!');");
                out.println("location='Classes_for_Professors.jsp';");
                out.println("</script>");
            }
        }else if(request.getParameter("EditClass")!=null){
            String classid = request.getParameter("Class-ID");
            String classname = request.getParameter("Class-Name");
            Classesdao dao2 = new Classesdao();
            String result = dao2.editClass(classid,classname,username);
            if (result.equals("Edited")){
                session.setAttribute("classid",classid);
                session.setAttribute("classname",classname);
                response.sendRedirect("assignments.jsp");
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Editing Success!');");
                out.println("location='Classes_for_Professors.jsp';");
                out.println("</script>");
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Editing failed!');");
                out.println("location='Classes_for_Professors.jsp';");
                out.println("</script>");
            }
        }*/
    }
}
