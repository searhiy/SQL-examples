package examples.domain;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by serhii on 06.11.14.
 */
@Entity
@Table(name = "orders")
public class Order {

    private static final String DATE_PATTERN = "EEEE, MMM dd, yyyy HH:mm:ss a";

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id", nullable = false)
    private long id;
    @Column(name = "order_date", nullable = false)
    private Date date;
    @Column(name = "client_id", nullable = false)
    private long clientId;
    @Column(name = "product_id", nullable = false)
    private long productId;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    private List<Product> products;

    public Order(Builder builder){
        this.date = builder.date;
        this.clientId = builder.clientId;
        this.productId = builder.productId;
    }

    public Order(){
        ;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public long getClientId() {
        return clientId;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + id + '\'' +
                "clientID='" + clientId + '\'' +
                "productID='" + productId + '\'' +
                ", date=" + date +
                '}';
    }

    public static class Builder {
        private Date date;
        private long clientId;
        private long productId;

        public Builder setDate(String date) {
            SimpleDateFormat formatter = new SimpleDateFormat(DATE_PATTERN);
            try {
                this.date = formatter.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Integer.valueOf(clientId).intValue();
            return this;
        }

        public Builder setProductId(String productId) {
            this.productId = Integer.valueOf(productId).intValue();
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
