package logic;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

    public static void main(String[] args) {
        // Khởi tạo map
        Map<String, Integer> map = new HashMap<>();

        // Thêm phần tử vào map
        map.put("apple", 2);
        map.put("banana", 5);
        map.put("orange", 3);

        // Duyệt qua các cặp key-value và in ra
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
