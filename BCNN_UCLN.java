import java.util.Scanner;
public class BCNN_UCLN {
    public static long ucln(long a, long b) {
        if (b == 0f) {
            return a;
        }
        return ucln(b, a % b);
    }

    public static long bcnn(long a, long b) {
        return (a * b) / ucln(a, b);
    }

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        while (T > 0) {
            long n = test.nextLong();
            long m = test.nextLong();
            System.out.print(bcnn(n, m));
            System.out.print(" ");
            System.out.print(ucln(m, n));
            T --;
            System.out.println();


        }
    }
}

