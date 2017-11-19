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
        String username = "kushal";
        String password = "root52";
        String usertype = "student";
        Userdao dao_test = new Userdao();
        dao_test.createUser(username,password,usertype);

    }

}
