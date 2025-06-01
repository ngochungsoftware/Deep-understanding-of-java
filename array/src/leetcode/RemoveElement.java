package leetcode;

public class RemoveElement {


    public int removeElement(int[] a, int val) {
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
        return 0;
    }

    public static void main(String[] args) {

    }
}
