import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int t = test.nextInt();
        while(t>0){
            double p = test.nextDouble();
            int d=-1, n=1;
            double tong = 1, a=1.0/(2*n+1);
            while(a>=p){
                tong += d*a;
                d-=d;
                a=1.0/(2*n+1);
                n+=1;
            }
            System.out.println(tong);
            t-=1;
        }
    }
}
