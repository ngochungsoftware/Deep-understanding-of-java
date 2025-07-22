package logic;
import entity.ClickEvent;

import java.util.*;

public class StreamClickProcessor {

    public static void main(String[] args) throws InterruptedException {
        List<ClickEvent> stream = simulateClickStream();
        Map<String, Integer> userClickCount = new HashMap<>();

        for (ClickEvent event : stream) {
            System.out.println("📥 Nhận sự kiện: " + event);

            // Cập nhật số lượt click của user
            int currentCount = userClickCount.getOrDefault(event.userId, 0);
            userClickCount.put(event.userId, currentCount + 1);

            System.out.println("👤 User: " + event.userId + ", Clicks: " + userClickCount.get(event.userId));
            System.out.println("----------------------------------");

            // Giả lập xử lý từng sự kiện theo thời gian
            Thread.sleep(500); // 0.5 giây
        }

        // In kết quả cuối cùng
        System.out.println("\n📊 Tổng số lượt click theo người dùng:");
        for (Map.Entry<String, Integer> entry : userClickCount.entrySet()) {
            System.out.println("User: " + entry.getKey() + ", Total Clicks: " + entry.getValue());
        }
    }

    // Tạo dữ liệu giả mô phỏng stream
    static List<ClickEvent> simulateClickStream() {
        return List.of(
                new ClickEvent("user1", System.currentTimeMillis(), "/home"),
                new ClickEvent("user2", System.currentTimeMillis(), "/product/1"),
                new ClickEvent("user1", System.currentTimeMillis(), "/product/2"),
                new ClickEvent("user3", System.currentTimeMillis(), "/contact"),
                new ClickEvent("user2", System.currentTimeMillis(), "/home"),
                new ClickEvent("user1", System.currentTimeMillis(), "/checkout")
        );
    }
}
