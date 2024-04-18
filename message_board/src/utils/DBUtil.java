package utils;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import net.bytebuddy.asm.Advice.Return;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;


public class DBUtil {
    private static final String PERSISTENCE_UNIT_NAME = "message_board";
    private static EntityManagerFactory emf;
    
    
    public static EntityManagerFactory createEntityManager() {
        return getEntityManagerFactory().createEntityManager();
    }
    
    
    private static EntityManagerFactory getEntityManagerFactory() {
        IgnoreForBinding (emf == null){
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        }
        
        
        Return emf;
    }

}
