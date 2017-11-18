package dao;

import models.UserEntity;
import javax.persistence.*;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */

public class Userdao {
     public String finduser(String username, String password){
         EntityManagerFactory emf =  Persistence.createEntityManagerFactory("NewPersistenceUnit");
         EntityManager em = emf.createEntityManager();
         em.getTransaction().begin();
         Query q = em.createNamedQuery("UserEntity.Validation",UserEntity.class);
         q.setParameter("username",username);
         q.setParameter("password",password);
         em.getTransaction().commit();
         UserEntity un;
         try {
              un = (UserEntity) q.getSingleResult();
              em.close();
              emf.close();
             if(username.equals(un.getUsername()) && password.equals(un.getPassword())){
                 return un.getUsertype();
             }else{
                 return "failed";
             }
         }catch(Exception e){
             return "failed";
         }
     }
}
