import java.util.Scanner;
public class KiemTraSoFiBo {
    public static long[] F = new long[100];
    public static void FiBo(){
        F[0] = 0l;
        F[1] = 1l;
        for(int i = 2; i <= 92; i++){
            F[i] = F[i-2]+F[i-1];
        }
    }
    public static Boolean Check(long n){
        for(long i : F){
            if( i == n){
                return true;
            } else if (i > n) {
                return false;

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        int T = test.nextInt();
        FiBo();
        while(T > 0){
            long n = test.nextLong();
            if(Check(n)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
            T--;
        }
    }

}
