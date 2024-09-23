import java.util.Scanner;
public class TinhLuyThua {
    public static final int MOD = (int) 1e9 + 7;
    public static long Pow(long a, long b){
        if(b == 0){
            return 1;
        }
        if(b == 1){
            return a % MOD;
        }
        long tmp = Pow(a, b/2);
        if(b%2 == 0){
            return (tmp*tmp)%MOD;
        }
        return (((tmp * tmp) % MOD) * a) % MOD;
    }
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        while(true){
            long a = test.nextLong();
            long b = test.nextLong();
            if( a == 0 && b == 0){
                return;
            }
            System.out.println(Pow(a, b));

        }
    }
}
