import java.util.Scanner;

public class XauNhiPhan {
    public static long[] lengths = new long[93];  // Độ dài của các chuỗi X[i]

    // Hàm tính toán độ dài của các chuỗi X[i]
    public static void computeLengths() {
        lengths[1] = 1; // X[1] có độ dài 1
        lengths[2] = 1; // X[2] có độ dài 1
        for (int i = 3; i <= 92; i++) {
            lengths[i] = lengths[i - 2] + lengths[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        computeLengths(); // Tính toán độ dài chuỗi

        int t = scanner.nextInt(); // Số lượng bộ test
        while (t-- > 0) {
            int n = scanner.nextInt();
            long k = scanner.nextLong();

            // Xác định ký tự thứ K trong chuỗi X[n]
            while (n > 2) {
                if (k <= lengths[n - 2]) {
                    n -= 2;
                } else {
                    k -= lengths[n - 2];
                    n -= 1;
                }
            }

            // In kết quả tương ứng với X[1] hoặc X[2]
            if (n == 1) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }

        scanner.close();
    }
}