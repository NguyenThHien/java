import java.util.Scanner;

public class DienThoaiCucGach {

    public static char change(char c) {
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
                return '2';
            case 'd':
            case 'e':
            case 'f':
                return '3';
            case 'g':
            case 'h':
            case 'i':
                return '4';
            case 'j':
            case 'k':
            case 'l':
                return '5';
            case 'm':
            case 'n':
            case 'o':
                return '6';
            case 'p':
            case 'q':
            case 'r':
            case 's':
                return '7';
            case 't':
            case 'u':
            case 'v':
                return '8';
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                return '9';
            default:
                return '0'; // Đây chỉ là một giá trị mặc định, mặc dù không cần thiết trong bài toán này.
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine(); // Đọc dòng còn lại sau khi đọc số lượng test cases

        while (T-- > 0) {
            String s = sc.nextLine().toLowerCase();
            StringBuilder res = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                res.append(change(s.charAt(i)));
            }
            System.out.println(res);
            // So sánh dãy số với phiên bản đảo ngược của nó
            String original = res.toString();
            String reversed = res.reverse().toString();

            if (original.equals(reversed)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}