import java.util.Scanner;
public class MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][3];
        int cnt = 0;
        for(int i=0; i<n; i++){
            int count = 0;
            for(int j=0; j<3; j++){
                a[i][j] = in.nextInt();
                if(a[i][j] == 1){
                    count++;
                }
            }
            if(count >= 2){
                cnt++;
            }
            count = 0;
        }
        System.out.println(cnt);
    }
}
