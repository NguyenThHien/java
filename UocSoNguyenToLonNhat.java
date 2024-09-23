import java.util.Scanner;
public class UocSoNguyenToLonNhat {
    public static Boolean is_Prime(long n){
        if(n < 2){
            return false;
        }
        for(long i = 2l; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        while(T > 0){
            long n = test.nextLong();
            long res = 0l;
            for (long i = 1l; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    // Check if i is a prime number
                    if (is_Prime(i)) {
                        res = Math.max(res, i);
                    }
                    // Check if n/i is a prime number
                    long otherDivisor = n / i;
                    if (is_Prime(otherDivisor)) {
                        res = Math.max(res, otherDivisor);
                    }
                }
            }
            System.out.println(res);
            T--;
        }

    }
}
