package logic;

import data.FakeOrderGenerator;
import entity.Order;

import java.util.*;

public class TestMapLog {
    public static void main(String[] args) {
        List<Order> orders = FakeOrderGenerator.generateOrders(5); // Sinh 5 đơn hàng để dễ theo dõi
        Map<String, Double> revenueMap = new HashMap<>();

        for (Order order : orders) {
            System.out.println("\n🔄 Đơn hàng mới: " + order);

            // Lấy doanh thu hiện tại
            double currentTotal = revenueMap.getOrDefault(order.city, 0.0);
            System.out.printf("➡️  Doanh thu hiện tại của %s: %.2f\n", order.city, currentTotal);

            // Cập nhật doanh thu
            double newTotal = currentTotal + order.amount;
            revenueMap.put(order.city, newTotal);

            System.out.printf("✅  Đã cập nhật: %s => %.2f\n", order.city, newTotal);

            // Log toàn bộ Map sau mỗi lần cập nhật
            System.out.println("📌 Trạng thái Map hiện tại:");
            for (Map.Entry<String, Double> entry : revenueMap.entrySet()) {
                System.out.printf("   - %s => %.2f\n", entry.getKey(), entry.getValue());
            }

            System.out.println("------------------------------------------------");
        }

        // In kết quả cuối cùng
        System.out.println("\n📊 Tổng doanh thu theo thành phố:");
        for (Map.Entry<String, Double> entry : revenueMap.entrySet()) {
            System.out.printf("📍 %s: %.2f VND\n", entry.getKey(), entry.getValue());
        }
    }
}
