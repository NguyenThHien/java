import java.util.Scanner;
public class UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        while (T > 0) {
            long n = test.nextLong();
            long dem = 0l;
            for (long i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) {
                        dem++;
                    }


                    if ((n/i) !=i && (n / i) % 2 == 0) {
                        dem++;
                    }
                }
            }

            System.out.println(dem);
            T--;
        }

        }
    }

