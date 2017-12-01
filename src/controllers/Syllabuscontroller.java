package controllers;

import dao.Syllabusdao;
import models.AssignmentEntity;
import models.SyllabusEntity;
//import sun.misc.IOUtils;

import javax.rmi.CORBA.Util;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.apache.commons.io.IOUtils;

//import static sun.security.provider.DSAParameterGenerator.toByteArray;
@WebServlet(name = "Assignmentcontroller")
@MultipartConfig
public class Syllabuscontroller extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        HttpSession session = request.getSession();
        String class_id =(String)session.getAttribute("coursId");
        InputStream inputStream = null;
        Part filePart = request.getPart("Assignment-doc");
        if(filePart!=null){
            inputStream = filePart.getInputStream();
        }
        Syllabusdao sd = new Syllabusdao();
        String result = sd.addsyllubus(class_id,inputStream);
        if(result == "done") {
            request.getRequestDispatcher("Syllubus.jsp").forward(request, response);
        }
        else{
            request.getRequestDispatcher("Syllubus.jsp").forward(request, response);
        }
    }
}