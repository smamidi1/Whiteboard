package controllers;

import dao.Assignmentdao;
import dao.Classesdao;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

/**
 * Created by Dhruva Juloori on 11/26/2017.
 */
@WebServlet(name = "Assignmentcontroller")
@MultipartConfig
public class Assignmentcontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String class_id = (String) session.getAttribute("classid");
        String class_name = (String) session.getAttribute("classname");
        String assignment_id = request.getParameter("Assignment-ID");
        String assignment_name = request.getParameter("Assignment-Name");
            //Integer total_points = Integer.valueOf(request.getParameter("Total-Points"));
            //out.println("Set");
        InputStream inputStream = null;
        Part filePart = request.getPart("Assignment-doc");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }
        Assignmentdao dao3 = new Assignmentdao();
        String result3 = dao3.addAssignment(assignment_id,assignment_name,inputStream,class_id,class_name);
        if(result3.equals("Perfect")){
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Inserting Success!');");
            out.println("location='assignments.jsp';");
            out.println("</script>");
        }else{
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Inserting UnSuccessful!');");
            out.println("location='assignments.jsp';");
            out.println("</script>");
             }
       }
  }



