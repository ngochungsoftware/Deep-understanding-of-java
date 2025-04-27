import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr =  new int[3];
        Scanner scanner = new Scanner(System.in);
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("finísh 1");
            scanner.close();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}