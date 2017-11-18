package dao;

import models.UserEntity;

import javax.management.*;
import javax.persistence.*;
import javax.persistence.Query;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */

public class Userdao {
     public String finduser(String username, String password){
         EntityManagerFactory emf =  Persistence.createEntityManagerFactory("NewPersistenceUnit");
         EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();
         Query q = (Query) em.createNamedQuery("UserEntity.Validation",UserEntity.class);
         q.setParameter("username",username);
         q.setParameter("password",password);
         UserEntity un = (UserEntity) q.getSingleResult();
         if(username.equals(un.getUsername()) && password.equals(un.getPassword())){
            return un.getUsertype();
         }else{
             return "failed";
         }
     }
}
