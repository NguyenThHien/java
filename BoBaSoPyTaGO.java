import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoBaSoPyTaGO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            int n = in.nextInt();
            long[] a = new long[n];
            Set<Long> squares = new HashSet<>();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextLong();
                squares.add(a[i]*a[i]);
            }
            int ok = 1;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    long sumSquare = a[i]*a[i]+a[j]*a[j];
                    if(squares.contains(sumSquare)){
                        ok = 0;
                        break;
                    }
                }
            }
            if(ok == 0) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
