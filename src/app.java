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
        String username = "user1";
        String password = "root";
        Userdao dao1 = new Userdao();
        String result = dao1.finduser(username,password);
        System.out.println(result);
    }

}
