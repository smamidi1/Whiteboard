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
        String class_id = request.getParameter("classid");
        //String class_name = (String) session.getAttribute("classname");
        String assignment_id = request.getParameter("Assignment-ID");
        String assignment_name = request.getParameter("Assignment-Name");
        String total_points = request.getParameter("Total-Points");
        InputStream inputStream = null;
        Part filePart = request.getPart("Assignment-doc");
        if (filePart != null) {
            inputStream = filePart.getInputStream();
        }
        Assignmentdao dao3 = new Assignmentdao();
        if (request.getParameter("add") != null) {
            String result3 = dao3.addAssignment(assignment_id, total_points, assignment_name, inputStream, class_id);
            if (result3.equals("Perfect")) {
                response.sendRedirect("assignments.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Inserting UnSuccessful!');");
                out.println("location='assignments.jsp';");
                out.println("</script>");
            }
        }else if (request.getParameter("edit") != null) {
            String result4 = dao3.editAssignment(assignment_id,assignment_name,total_points,inputStream,class_id);
            if (result4.equals("Editing Succesful")) {
                response.sendRedirect("assignments.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Editing UnSuccessful!');");
                out.println("location='assignments.jsp';");
                out.println("</script>");
            }
        }else if (request.getParameter("delete") != null) {
            String result5 = dao3.removeAssignment(assignment_id);
            if (result5.equals("Removed")) {
                response.sendRedirect("assignments.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Editing UnSuccessful!');");
                out.println("location='assignments.jsp';");
                out.println("</script>");
            }
        }
    }
  }



