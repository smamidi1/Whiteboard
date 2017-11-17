package dao;

import models.UserEntity;

import javax.management.*;
import javax.persistence.*;
import javax.persistence.Query;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */

public class Userdao {
   //EntityManager emf = (EntityManager) Persistence.createEntityManagerFactory("NewPersistenceUnit");
     public String finduser(String username, String password){
         EntityManagerFactory emf =  Persistence.createEntityManagerFactory("NewPersistenceUnit");
        EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();
        //System.out.println("i am here");
        Query q = (Query) em.createNamedQuery("UserEntity.findAll",UserEntity.class);
       /* q.setParameter(username,username);
        q.setParameter(password,password);*/
        UserEntity un = (UserEntity) q.getSingleResult();
        //System.out.println(un.getUsername());
        if(username.equals(un.getUsername()) && password.equals(un.getPassword())){
            return un.getUsertype();
        }else{
            return "failed";
        }
     }
}
