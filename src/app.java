import models.ClassesEntity;
import models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dhruva Juloori on 11/14/2017.
 */
public class app {
    public static void main(String args[]) {
        /*String username = "user2";
        String password = "root";
        String usertype = "Student";
        Userdao dao_test = new Userdao();
        dao_test.createUser(username,password,usertype);*/
        //System.out.println(result);
        //String class_id = "ITMD-515";
       /* UserEntity ce = new UserEntity();
        ce.setUsername("Omar");
        ClassesEntity ce1 = new ClassesEntity();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit-1");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(ce);
        em.getTransaction().commit();
        em.close();*/
        //Userdao test = new Userdao();
        //String result = test.findUser("user2", "Global@123");
        //System.out.println(result);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit-1");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        UserEntity ue = new UserEntity();
        ue.setUsername("kushal");
        ue.setUsertype("Student");
        ue.setPassword("Global@123");

       ClassesEntity ce = new ClassesEntity();
       ce.setClassName("ITMD-510");
       ce.setClassId("5678");
       ce.setUsr(ue);

       ClassesEntity ce2 = new ClassesEntity();
       ce2.setClassId("8907");
       ce2.setClassName("ITMD-515");
       ce2.setUsr(ue);

        List<ClassesEntity> classes = new ArrayList<ClassesEntity>();
        classes.add(ce);
        classes.add(ce2);

        ue.setClasses(classes);
        em.persist(ue);
    }

}
