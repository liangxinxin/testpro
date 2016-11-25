package org.liangxinxin.testpro.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration configuration = new AnnotationConfiguration();
         configuration.configure();
         SchemaExport export = new SchemaExport(configuration);
         export.execute(true, true, false, true);
         SessionFactory factory = configuration.buildSessionFactory();
//         Session session = factory.openSession();
         Session session = factory.getCurrentSession();
         session.beginTransaction();
        
         session.getTransaction().commit();
//         session.close();

        System.out.println( "Hello World!" );
    }
}
