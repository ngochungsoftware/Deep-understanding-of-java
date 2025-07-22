package leetcode;

public class RemoveElement {


    public static int removeElement(int[] a, int val) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == val) {
                for (int j = i; j < n - 1; j++) {
                    a[j] = a[j + 1];
                }
                n--;
                i--;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        System.out.println(removeElement(a, 3));
        for (int ai : a) {
            System.out.println(ai);
        }
        System.out.println("DONE");
    }
}
