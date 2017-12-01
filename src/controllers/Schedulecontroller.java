package controllers;

import dao.Classesdao;
import dao.Scheduledao;
import models.ScheduleEntity;
import org.omg.CORBA.Request;

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
@WebServlet(name = "Schedulecontroller")
public class Schedulecontroller extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String timings = request.getParameter("timings");
        String location = request.getParameter("location");
        String schedule_id = request.getParameter("schedule_id");
        String class_id = request.getParameter("class-id");
        String day = request.getParameter("day");
        Scheduledao sed = new Scheduledao();
        if (request.getParameter("add") != null) {
            String result = sed.addSchedule(timings, location, class_id, schedule_id, day);
            if (result.equals("Schedule Added")) {
                response.sendRedirect("schedule.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Inserting failed!');");
                out.println("</script>");
                response.sendRedirect("schedule.jsp");
            }
        } else if (request.getParameter("edit") != null) {
            String result = sed.editSchedule(timings, location, class_id, schedule_id, day);
            if (result.equals("Schedule Edited")) {
                response.sendRedirect("schedule.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Editing failed!');");
                out.println("</script>");
                response.sendRedirect("schedule.jsp");
            }
        } else if (request.getParameter("remove") != null) {
            String result = sed.removeSchedule(schedule_id);
            if (result.equals("Schedule Removed")) {
                response.sendRedirect("schedule.jsp");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Removing failed!');");
                out.println("</script>");
                response.sendRedirect("schedule.jsp");
            }
        }
    }

}
