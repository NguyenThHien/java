import java.util.Scanner;
public class BoSungDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        boolean[] d = new boolean[202];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
            d[a[i]] = true;
        }
        int ok = 1;
        for(int i=1; i<=a[n-1]; i++){
            if(d[i] == false){
                System.out.println(i);
                ok = 0;

            }
        }
        if(ok == 1){
            System.out.println("Excellent!");
        }
    }
}
