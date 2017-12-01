package dao;
import models.SyllabusEntity;
import sun.misc.IOUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.io.ByteArrayInputStream;
//import org.apache.commons.io.IOUtils;

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

    public String addsyllubus(String class_id, InputStream inputStream) throws IOException {
        SyllabusEntity syllubusEntity = new SyllabusEntity();
        syllubusEntity.setClassId(class_id);
        syllubusEntity.setSyllabus(org.apache.commons.io.IOUtils.toByteArray(inputStream));
        em.getTransaction().begin();
        em.persist(syllubusEntity);
        em.getTransaction().commit();
        em.close();
        return "done";

    }
}