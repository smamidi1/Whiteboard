package dao;

import models.AssignmentEntity;
import models.ClassesEntity;
import models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dhruva Juloori on 11/26/2017.
 */
public class Classesdao {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("PersistenceUnit-1");
    EntityManager em = emf.createEntityManager();

    public String addClass(String classid, String classname, String username){
        //System.out.println(classid + " " + classname + " " + username);
        UserEntity user = new UserEntity();
        user.setUsername(username);
        ClassesEntity ce = new ClassesEntity();
        ce.setClassId(classid);
        ce.setClassName(classname);
        ce.setUSER_NAME(username);
        em.getTransaction().begin();
        em.persist(ce);
        try {
            em.getTransaction().commit();
            em.close();
            emf.close();
            return "Inserted";
        }catch (Exception e){
            return "Not Inserted";
        }
    }

    public List getAllCourses() {
        em.getTransaction().begin();
        //SessionFactory sessionFactory = HibernateUtil.getSe
        Query q = em.createNamedQuery("ClassesEntity.findAll",ClassesEntity.class);
        List<ClassesEntity> cs;
        cs = q.getResultList();
        //cs = (List<ClassesEntity>) q;
        return cs;
    }

    public String editClass(String classid, String classname, String username) {
        UserEntity user = new UserEntity();
        user.setUsername(username);
        ClassesEntity ce = new ClassesEntity();
        ce.setClassId(classid);
        ce.setClassName(classname);
        ce.setUSER_NAME(username);
        em.getTransaction().begin();
        em.merge(ce);
        try {
            em.getTransaction().commit();
            em.close();
            emf.close();
            return "Edited";
        } catch (Exception e) {
            return "Not Edited";
        }
    }

    public String removeClass(String classid){
        em.getTransaction().begin();
        ClassesEntity ce = em.find(ClassesEntity.class,classid);
        em.remove(ce);
        try {
            em.getTransaction().commit();
            System.out.println("Removed");
            em.close();
            emf.close();
            return "Removed";
        }catch (Exception e){
            System.out.println("I am here!");
            return "Not Removed";
        }
    }
}
