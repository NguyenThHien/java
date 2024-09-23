import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        in.close();
        System.out.println(countValidPairs(a));  // In ra số cặp thoả mãn điều kiện
    }

    public static int countValidPairs(int[] a) {
        int n = a.length;
        if (n < 2) {
            return 0;
        }

        // Mảng để lưu giá trị lớn nhất trong đoạn từ i+1 đến j-1
        int[] max_in_between = new int[n];

        // Tính giá trị lớn nhất trong đoạn từ i+1 đến j-1
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                max_in_between[i] = a[i + 1];
                for (int j = i + 2; j < n; j++) {
                    max_in_between[i] = Math.max(max_in_between[i], a[j]);
                }
            } else {
                max_in_between[i] = Integer.MIN_VALUE;
            }
        }

        // Đếm số cặp (i, j) thỏa mãn điều kiện
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // Kiểm tra nếu không có số nào lớn hơn a[i] và a[j] trong đoạn i+1 đến j-1
                if (max_in_between[i] <= Math.min(a[i], a[j])) {
                    count++;
                }
            }
        }

        return count;
    }
}