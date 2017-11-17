import dao.Userdao;
import models.TaEntity;
import models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Dhruva Juloori on 11/14/2017.
 */
public class app {
    public static void main(String args[]){
        /*UserEntity se1 = new UserEntity();
        se1.setUsertype("Professor");
        se1.setUsername("user");
        se1.setPassword("root");*/
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory("NewPersistenceUnit");
        //EntityManager em = emf.createEntityManager();
        //em.getTransaction().begin();
        //em.persist(se1);
        //UserEntity un = em.createNamedQuery("UserEntity.Validation",UserEntity.class).getSingleResult();
        //System.out.println(un.getUsername());
        //em.getTransaction().commit();
        String username = "user";
        String password = "root";
        //System.out.println(username + " " + password);
        Userdao dao1 = new Userdao();
        String result = dao1.finduser(username,password);
        System.out.println(result);

        //em.close();

    }

}
