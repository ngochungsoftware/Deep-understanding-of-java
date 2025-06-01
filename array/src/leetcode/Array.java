package leetcode;

public class Array {

    public static int findNumbers(int[] nums) {
        int dem = 0;
        for (int a : nums) {
            // kiem tra so chu so cua a
            // neu so chu so la chan tang bien dem len 1
            int soLuongChuSo = tinhSoChuSo(a);
            if (soLuongChuSo % 2 == 0) dem++;

        }
        return dem;
    }

    private static int tinhSoChuSo(int a) {
        int dem = 0;
        while (a > 0) {
            dem++;
            a /= 10;
        }
        return dem;
    }

    public static void main(String[] args) {
        int[] nums = {1,22,3,4};
        int[] n2 = new int[4];

//         n2[0] = 4;
//         n2[1] = 3;
//         n2[2] = 2;
//         n2[3] = 1;

//        for (int i = 0; i < n2.length; i++) {
//            n2[i] = n2.length - i;
//        }
//
//         for (int ai : n2) {
//             System.out.println("ai: "+ ai);
//         }

        System.out.println(findNumbers(nums));
     }
}
