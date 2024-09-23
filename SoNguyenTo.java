import java.util.Scanner;
public class SoNguyenTo {
    public static Boolean checkNt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt((n)); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        while ( T > 0){

            int n = test.nextInt();
            if (checkNt((n))) {
                System.out.println("YES");

            } else {
                System.out.println("NO");
            }
            T--;

        }

    }
}
