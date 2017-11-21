import models.ClassesEntity;
import models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Dhruva Juloori on 11/14/2017.
 */
public class app {
    public static void main(String args[]){
        /*String username = "user2";
        String password = "root";
        String usertype = "Student";
        Userdao dao_test = new Userdao();
        dao_test.createUser(username,password,usertype);*/
       //System.out.println(result);
        String class_id = "ITMD-515";
        UserEntity ce = new UserEntity();

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit-1");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(ce);
        em.getTransaction().commit();
        em.close();
    }

}
