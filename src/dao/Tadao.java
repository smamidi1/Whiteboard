package dao;

import models.TaEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class Tadao {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("PersistenceUnit-1");
    EntityManager em = emf.createEntityManager();
    public List getAllTa(){
        em.getTransaction().begin();
        Query t_a = em.createNamedQuery("TaEntity.findAll", TaEntity.class);
        List<TaEntity> ts;
        ts  = t_a.getResultList();
        return ts;

    }
}