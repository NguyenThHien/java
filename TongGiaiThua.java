
import java.util.Scanner;

public class TongGiaiThua {
    public static long giaiThua(long n){
        long Tich = 1l;
        for(long i = 2l; i <= n; i++){
            Tich*=i;
        }
        return Tich;
    }

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        long n = test.nextLong();
        long Tong = 0l;
        for(long i = 1l; i <= n; i++ ){
            Tong += giaiThua(i);
        }
        System.out.println(Tong);
    }
}
