import java.math.BigInteger;
import java.util.Scanner;

public class BCNN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while(t-->0){
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            BigInteger res = (a.multiply(b)).divide(a.gcd(b));
            System.out.println(res);
        }
    }
}
