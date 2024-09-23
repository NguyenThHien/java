import java.math.BigInteger;
import java.util.Scanner;

public class Hieu2SoNguyenLon_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            BigInteger numX = in.nextBigInteger();
            BigInteger numY = in.nextBigInteger();
            BigInteger result = numX.subtract(numY).abs();

            System.out.println(result);

    }
}
