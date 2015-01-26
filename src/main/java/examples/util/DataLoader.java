package examples.util;

import examples.domain.Client;
import examples.domain.Order;
import examples.domain.Product;
import examples.util.processors.ClientProcessor;
import examples.util.processors.GroupProcessor;
import examples.util.processors.OrderProcessor;
import examples.util.processors.ProductProcessor;

import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public class DataLoader {

    public static List<Client> loadClients() {
        return (List<Client>)CSVReader.readCsv("data/customer/client.csv", new ClientProcessor());
    }

    public static List<Product> loadProducts() {
        return (List<Product>)CSVReader.readCsv("data/customer/products.csv", new ProductProcessor());
    }

    public static List<Order> loadOrders() {
        return (List<Order>)CSVReader.readCsv("data/customer/orders.csv", new OrderProcessor());
    }

    public static List<Product> loadGroups() {
        return (List<Product>)CSVReader.readCsv("data/customer/groups.csv", new GroupProcessor());
    }

}
