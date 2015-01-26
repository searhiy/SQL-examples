package examples;

import examples.service.OrderService;
import examples.service.ClientService;
import examples.util.DataLoader;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Service for launching database according to defined database (see property file).
 */
public class Launcher {

    public static void main( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClientService clientService = (ClientService)ctx.getBean("client_service");
        //OrderService orderService = (OrderService)ctx.getBean("order_service");
        //orderService.saveOrders(DataLoader.loadOrders());
        clientService.saveClients(DataLoader.loadClients());
    }
}
