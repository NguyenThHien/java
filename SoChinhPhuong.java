
import java.util.Scanner;
public class SoChinhPhuong {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int t = test.nextInt();
        while(t>0){
            long n = test.nextLong();
            long x = (long)Math.sqrt(n);
            if( x*x == n ){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
