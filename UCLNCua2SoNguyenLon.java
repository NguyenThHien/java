import java.math.BigInteger;
import java.util.Scanner;

public class UCLNCua2SoNguyenLon {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int T = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng mới sau số lượng test cases

            for (int i = 0; i < T; i++) {
                BigInteger a = new BigInteger(scanner.nextLine().trim());
                BigInteger b = new BigInteger(scanner.nextLine().trim());

                // Tính UCLN bằng cách sử dụng thuật toán Euclid
                BigInteger result = a.gcd(b);

                // In kết quả
                System.out.println(result);
            }

            scanner.close();
        }
    }

