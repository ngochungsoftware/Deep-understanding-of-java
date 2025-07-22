package logic;

import data.FakeOrderGenerator;
import entity.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevenueByCity {
    public static void main(String[] args) {
        List<Order> fakeOrders = FakeOrderGenerator.generateOrders(1_000_000); // 1 triệu đơn hàng

        Map<String, Double> revenueMap = new HashMap<>();

        for (Order order : fakeOrders) {
            revenueMap.put(
                    order.city,
                    revenueMap.getOrDefault(order.city, 0.0) + order.amount
            );
        }

        // In kết quả
        for (Map.Entry<String, Double> entry : revenueMap.entrySet()) {
            System.out.printf("Thành phố: %-10s - Tổng doanh thu: %.2f VND\n", entry.getKey(), entry.getValue());
        }
    }
}
