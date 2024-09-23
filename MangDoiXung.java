import java.util.Scanner;
public class MangDoiXung {
    public static boolean check(int[] a, int n){
        int l = 0;
        int r = n-1;
        while( l <= r){
            if(a[l] != a[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int t = test.nextInt();

        while(t > 0){
             int n = test.nextInt();
             int[] a = new int[n];
             for(int i=0; i<n; i++){
                 a[i] = test.nextInt();

             }
             if(check(a, n)){
                 System.out.println("YES");
             }else System.out.println("NO");
             t--;

        }



    }
}
