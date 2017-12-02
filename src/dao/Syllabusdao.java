package dao;

import models.ClassesEntity;
import models.SyllabusEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Syllabusdao {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("PersistenceUnit-1");
    EntityManager em = emf.createEntityManager();
    public List getAllSyllubus(){
        em.getTransaction().begin();
        Query s_q = em.createNamedQuery("SyllabusEntity.findAll", SyllabusEntity.class);;
        List<SyllabusEntity> se;
        se = s_q.getResultList();
        return se;
    }

    public String addsyllubus(String class_id, InputStream inputStream, String syllabus) throws IOException {
        SyllabusEntity syllubusEntity = new SyllabusEntity();
        syllubusEntity.setCLASS_ID(class_id);
        syllubusEntity.setIdsyllabus(syllabus);
        syllubusEntity.setSyllabus(org.apache.commons.io.IOUtils.toByteArray(inputStream));
        em.getTransaction().begin();
        em.persist(syllubusEntity);
        try {
            em.getTransaction().commit();
            em.close();
            return "done";
        }catch (Exception e){
            return "not done";
        }
    }

    public String removeSyllabus(String syllabus_id){
        em.getTransaction().begin();
        SyllabusEntity syllabus = em.find(SyllabusEntity.class,syllabus_id);
        em.remove(syllabus);
        try {
            em.getTransaction().commit();
            em.close();
            emf.close();
            return "Syllabus Removed";
        }catch (Exception e){
            return "Not Removed";
        }
    }
}