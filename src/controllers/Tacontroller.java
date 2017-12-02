package controllers;

import dao.Classesdao;
import dao.Tadao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dhruva Juloori on 12/1/2017.
 */
@WebServlet(name = "Tacontroller")
public class Tacontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String ta_id = request.getParameter("ta-id");
        String ta_name = request.getParameter("ta_name");
        String class_id = request.getParameter("class_id");
        String ta_email = request.getParameter("ta_email");
        String ta_phone = request.getParameter("ta_phone");
        String ta_timings = request.getParameter("ta_timings");
        String day = request.getParameter("day");
        Tadao tadao = new Tadao();
        if (request.getParameter("add") != null) {
            String result7 = tadao.addTa(ta_id, ta_name, ta_email, ta_phone, ta_timings, class_id, day);
            if (result7.equals("Ta Added")) {
                response.sendRedirect("courses.jsp");
            } else {

                out.println("<script type=\"text/javascript\">");
                out.println("alert('Inserting failed!');");
                out.println("</script>");
                response.sendRedirect("courses.jsp");
            }
        } else if (request.getParameter("RemoveTa") != null) {
            String result7 = tadao.removeTa(ta_id);
            if (result7.equals("Ta Removed")) {
                response.sendRedirect("courses.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Removing failed!');");
                out.println("</script>");
                response.sendRedirect("courses.jsp");
            }
        }
    }
}
