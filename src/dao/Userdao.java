package dao;

import models.UserEntity;
import javax.persistence.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Dhruva Juloori on 11/16/2017.
 */

public class Userdao {
    EntityManagerFactory emf =  Persistence.createEntityManagerFactory("NewPersistenceUnit");
    EntityManager em = emf.createEntityManager();

     public String finduser(String username, String password){
         em.getTransaction().begin();
         Query q = em.createNamedQuery("UserEntity.Validation",UserEntity.class);
         String hashed_password = getMD5(password);
         q.setParameter("username",username);
         q.setParameter("password",hashed_password);
         em.getTransaction().commit();
         UserEntity un;
         try {
              un = (UserEntity) q.getSingleResult();
              em.close();
              emf.close();
             if(username.equals(un.getUsername()) && hashed_password.equals(un.getPassword())){
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
        String hashed_password = getMD5(password);
        user.setPassword(hashed_password);
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

    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
