package examples;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Service for launching database according to defined database (see property file).
 */
public class DatabaseLauncher {

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        while (true){

        }
    }
}
