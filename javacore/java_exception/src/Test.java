public class Test {
    public static void main(String[] args) {

        float sum = 0;
        try {
            sum = Caculator.devide(20, 0);
            System.out.println("Sum: " + sum);
        } catch (DevideByZeroException e) {
            System.out.println(e.getMessage());
        }

    }
}
