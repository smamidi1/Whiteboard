package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.*;
import java.util.List;

import models.AssignmentEntity;
import org.apache.commons.io.IOUtils;

/**
 * Created by Dhruva Juloori on 11/26/2017.
 */
public class Assignmentdao {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("PersistenceUnit-1");
    EntityManager em = emf.createEntityManager();

    public String addAssignment(String assignment_id, String assignment_name, InputStream test, String class_id, String class_name) throws IOException {
        AssignmentEntity assignmentEntity = new AssignmentEntity();
        assignmentEntity.setAssignmentId(assignment_id);
        assignmentEntity.setAssignmentName(assignment_name);
        assignmentEntity.setAssignment(IOUtils.toByteArray(test));
        assignmentEntity.setCLASS_ID(class_id);
        em.getTransaction().begin();
        em.persist(assignmentEntity);
        try {
            em.getTransaction().commit();
            em.close();
            emf.close();
            return "Perfect";
        }catch (Exception e){
            return "Not Inserted";
        }
    }

    public List getAllAssignments(){
        em.getTransaction().begin();
        Query a_q = em.createNamedQuery("AssignmentsEntity.findAll", AssignmentEntity.class);;
        List<AssignmentEntity> ae;
        ae = a_q.getResultList();
        return ae;
    }
}
