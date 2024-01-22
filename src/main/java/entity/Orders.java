package entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long order_id;
    private Integer quantity;
    private Double price_total;
    private String date;
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Customer customer_id;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice_total() {
        return price_total;
    }

    public void setPrice_total(Double price_total) {
        this.price_total = price_total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Customer getCust_id() {
        return customer_id;
    }

    public void setCust_id(Customer cust_id) {
        this.customer_id = cust_id;
    }
}
