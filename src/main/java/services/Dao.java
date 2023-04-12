package services;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author brunomonteiro
 */
public class Dao {
    public static void main(String[] args) {
        EntityManagerFactory dao = Persistence.createEntityManagerFactory("persistence");
        dao.createEntityManager();
    } 
}
