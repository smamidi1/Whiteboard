package dao;

import models.UserEntity;
import javax.persistence.*;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */

public class Userdao {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("NewPersistenceUnit");
    EntityManager em = emf.createEntityManager();

     public String finduser(String username, String password){
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

    public void createUser(String username, String password, String usertype){
        UserEntity user = new UserEntity();
        user.setUsername(username);
        user.setPassword(password);
        user.setUsertype(usertype);
        em.getTransaction().begin();
        em.persist(user);
        try {
            em.getTransaction().commit();
            em.close();
            emf.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
