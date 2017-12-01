import dao.Assignmentdao;
import dao.Classesdao;
import models.ClassesEntity;
import models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dhruva Juloori on 11/14/2017.
 */
public class app {
    public static void main(String args[]) {
      /*UserEntity ue = new UserEntity();
        ue.setUsername("Kushal");

        ClassesEntity ce = new ClassesEntity();
        ce.setClassId("ITMD-518");
        ce.setClassName("Java");

        ce.setUsr(ue);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit-1");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(ce);
        em.getTransaction().commit();
        em.close();
      /*
      ue.setUsername("Kushal");

      ClassesEntity ce = new ClassesEntity();
      ce.setClassId("ITMD-518");
      ce.setClassName("Java");

      ClassesEntity ce2 = new ClassesEntity();
      ce2.setClassId("8907");
      ce2.setClassName("ITMD-515");

      List<ClassesEntity> classes = new ArrayList<>();
      classes.add(ce);
      classes.add(ce2);

      ue.setClasses(classes);
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersistenceUnit-1");
      EntityManager em = emf.createEntityManager();
      em.getTransaction().begin();
      em.persist(ue);
      em.getTransaction().commit();
      em.close();*/
        //Assignmentdao d1 = new Assignmentdao();
        //File file =
              //  new File("C:/Users/Sudha/Desktop/project_515.sql");
      //d1.addClass("ITM","Java","user");
        //d1.addAssignment("1","Network",100,)

      Classesdao d1 = new Classesdao();
      d1.removeClass("1");

    }

}
