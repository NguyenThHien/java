import java.util.Scanner;
import java.util.regex.Pattern;

public class bai13_9 {
    // Lớp Xau được định nghĩa là lớp tĩnh bên trong lớp bai13_9
    static class Xau {
        private static final String CODE_PATTERN = "^[bB]\\d{2}(DC|dc)(AT|at|CN|cn)\\d{3}$";
        private static final String BILL_PATTERN = "^[nNxX]\\d{2}(PTIT|ptit)\\d{2,4}$";

        // Constructor không cần thiết nếu không khởi tạo gì
        public Xau() {
            // Có thể khởi tạo các thuộc tính nếu cần
        }

        // Phương thức kiểm tra mã sinh viên
        public boolean isCodeValid(String s) {
            return Pattern.matches(CODE_PATTERN, s);
        }

        // Phương thức kiểm tra mã hóa đơn
        public boolean isBillCode(String s) {
            return Pattern.matches(BILL_PATTERN, s);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Tạo đối tượng Xau
        Xau x = new Xau();

        // Đọc mã sinh viên và kiểm tra
        String st = in.nextLine();
        System.out.println(x.isCodeValid(st));

        // Đọc mã hóa đơn và kiểm tra
        st = in.nextLine();
        System.out.println(x.isBillCode(st));


    }
}