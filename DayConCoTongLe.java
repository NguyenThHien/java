import java.util.Scanner;

public class DayConCoTongLe {
    public void out(int[] b, int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[b[i]]+" ");
        }
        System.
    }
    public void Try(int i, int n, int[] b){
        for(int j=0; j<=1; j++){
            b[i] = j;
            if(i==n)
                if(check(b, a, n))
                    out();
            else Try(i+1, n, b);
        }


    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){
            n = in.nextInt();

            for(int i=0; i<n; i++){
                a[i] = in.nextInt();
            }

        }
    }
}