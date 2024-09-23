import java.util.Scanner;
public class HopCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int n = test.nextInt();
        int m = test.nextInt();
        int[] a = new int[n];
        int[] b= new int[m];
        int[] dd = new int[1001];
        for(int i=0; i<n; i++){
            a[i] = test.nextInt();
            dd[a[i]] = 1;
        }
        for(int i=0; i<m; i++){
            b[i] = test.nextInt();
            dd[b[i]] = 1;
        }
        for(int i = 1; i < 1001; i++){
            if(dd[i] == 1){
                System.out.print(i +" ");

            }
        }
    }
}
