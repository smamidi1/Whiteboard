package controllers;

import dao.Classesdao;
import dao.Syllabusdao;
//import sun.misc.IOUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

//import static sun.security.provider.DSAParameterGenerator.toByteArray;
@WebServlet(name = "Syllabuscontroller")
@MultipartConfig
public class Syllabuscontroller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        //HttpSession session = request.getSession();
        String syllabus_id = request.getParameter("idsyllabus");
        String class_id =request.getParameter("courseId");
        InputStream inputStream = null;
        Part filePart = request.getPart("Assignment-doc");
        if(filePart!=null){
            inputStream = filePart.getInputStream();
        }
        Syllabusdao sd = new Syllabusdao();
        if(request.getParameter("add")!=null) {
            String result = sd.addsyllubus(class_id, inputStream, syllabus_id);
            if (result == "done") {
                request.getRequestDispatcher("Syllubus.jsp").forward(request, response);
            } else {
                //PrintWriter out = response.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Inserting failed!');");
                out.println("location='Addsyllubus.jsp';");
                out.println("</script>");
            }
        }else if(request.getParameter("delete")!=null){
            String result = sd.removeSyllabus(syllabus_id);
            if (result.equals(" Syllabus Removed")){
                response.sendRedirect("Syllubus.jsp");
            }else{
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Removing failed!');");
                out.println("</script>");
                response.sendRedirect("Syllubus.jsp");
            }
        }
    }
}