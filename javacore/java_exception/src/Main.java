import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner input = new Scanner(System.in);
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("enter the word part arr[%d] = ", i);
                arr[i] = input.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finish 1");
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}