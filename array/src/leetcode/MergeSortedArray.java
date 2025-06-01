package leetcode;

public class MergeSortedArray {

    public static void merge(int[] n1, int m, int[] n2, int n) {

        for (int ai : n2) {
            chenPhanTuVaoMang(ai, n1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean timDuoc = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                // Dời các phần tử sang phải để chừa chỗ
                timDuoc = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i+1] = a[i];
                }
                a[k] = x; // chèn x vào vị trí đúng
                break;
            }
        }
        if (timDuoc == false) {
            a[m] = x;// Nếu x lớn hơn tất cả, thì chèn vào cuối mảng
        }
    }


    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};

        merge(n1, 3, n2, 5);
        System.out.println("DONE");
    }
}
