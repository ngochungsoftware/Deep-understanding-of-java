package entity;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Order {
    public String orderId;
    public String city;
    public String customerName;
    public double amount;

    public Order(String orderId, String city, String customerName, double amount) {
        this.orderId = orderId;
        this.city = city;
        this.customerName = customerName;
        this.amount = amount;
    }
}
