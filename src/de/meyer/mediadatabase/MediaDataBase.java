package de.meyer.mediadatabase;

import de.meyer.mediadatabase.model.Actor;
import de.meyer.mediadatabase.resources.Messages;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Enumeration;
import java.util.ResourceBundle;

/**
 * Created by thufir on 29.02.16.
 */
public class MediaDataBase {


public static void main (String[] args) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("mediadatabase");
    EntityManager em = emf.createEntityManager();
    Messages mes = Messages.getInstance();

    System.out.println(mes.getString("welcome"));
    Actor myactor = new Actor();
    myactor.setName("Robert Lustig");
    myactor.setDescription("Famous!");
    System.out.println("Created new Actorc1" + myactor.getName());
    em.getTransaction().begin();
    System.out.println("Transaction BEGIN");
    em.persist(myactor);
    em.getTransaction().commit();
    System.out.println("Transaction Commit");
    Actor readActor = new Actor();
    readActor = em.find(Actor.class, myactor.getId());
    System.out.println("Read new Actor 2" + readActor.getName());
    em.close();
    emf.close();
    }
}
