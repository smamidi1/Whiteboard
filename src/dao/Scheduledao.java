package dao;

import models.ScheduleEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Scheduledao{
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("PersistenceUnit-1");
    EntityManager em = emf.createEntityManager();
    public List getAllschedule(){
        em.getTransaction().begin();
        //SessionFactory sessionFactory = HibernateUtil.getSe
        Query q = em.createNamedQuery("ScheduleEntity.findAll", ScheduleEntity.class);
        List<ScheduleEntity> se;
        se = q.getResultList();
        return se;
    }
}