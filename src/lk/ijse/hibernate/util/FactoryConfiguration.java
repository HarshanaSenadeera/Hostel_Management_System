package lk.ijse.hibernate.util;

import lk.ijse.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * @author : Harshana Senadeera
 * @since : 0.1.0
 **/
public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;

    private final SessionFactory sessionFactory;

    private FactoryConfiguration(){

        StandardServiceRegistry buildRegistry = new StandardServiceRegistryBuilder()
                .loadProperties("Property_File.properties")
                .configure().build();
        sessionFactory = new MetadataSources(buildRegistry)
                .getMetadataBuilder().build().
                getSessionFactoryBuilder().build();
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration==null ? factoryConfiguration=new FactoryConfiguration()
                :factoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }

}
