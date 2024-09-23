import java.util.Scanner;
public class TinhSoFiBo {
    public static long[] F = new long[100];

    public static void FiBo(){
        F[1] = F[2] = 1L;
        for(int i = 3; i <= 92; i++){
            F[i] = F[i-1] + F[i-2];
        }


    }

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        FiBo();
        while(T > 0){
            int n = test.nextInt();
            System.out.println(F[n]);
            T--;
        }
    }
}
