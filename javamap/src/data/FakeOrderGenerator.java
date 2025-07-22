package data;

import entity.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FakeOrderGenerator {
    static String[] cities = {"Hanoi", "Saigon", "DaNang", "CanTho"};
    static String[] names = {"Hung", "Linh", "Nam", "Trang", "An", "Huy"};

    public static List<Order> generateOrders(int count) {
        List<Order> orders = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            String city = cities[rand.nextInt(cities.length)];
            String name = names[rand.nextInt(names.length)];
            double amount = ThreadLocalRandom.current().nextDouble(100, 1000); // giá từ 100 - 1000
            String orderId = "ORD" + i;
            orders.add(new Order(orderId, city, name, amount));
        }
        return orders;
    }
}
