package examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Service for launching application. Application will create tables for defined database using environment variable.
 * For example, database=mysql
 */
public class Launcher {

    public static void main( String[] args ) {
        new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
