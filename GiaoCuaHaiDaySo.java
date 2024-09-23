
import java.util.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int n = test.nextInt();
        int m = test.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int[] dd = new int[1005];
        for(int i=0; i<n; i++ ) {
            a[i] = test.nextInt();
            dd[a[i]] = 1;
        }


        for(int i=0; i<m; i++ ) {
            b[i] = test.nextInt();
        }
        Arrays.sort(b);

        for(int j=0; j<m; j++){
            if(dd[b[j]] == 1){
                System.out.print(b[j] + " ");
                dd[b[j]] = 2;
                }
            }

        }
    }

