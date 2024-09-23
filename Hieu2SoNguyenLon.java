import java.math.BigInteger;
import java.util.Scanner;

public class Hieu2SoNguyenLon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while (t-->0){
            BigInteger numX = in.nextBigInteger();
            BigInteger numY = in.nextBigInteger();
            BigInteger result = numX.subtract(numY).abs();
            StringBuilder res = new StringBuilder(result.toString());
            int maxLen = Math.max(numY.toString().length(), numX.toString().length());
            while(res.length() < maxLen){
                res.insert(0, '0');
            }
            System.out.println(res.toString());
        }
    }
}
