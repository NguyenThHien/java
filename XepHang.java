import java.util.Scanner;

public class XepHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][2];
        for(int i=0; i<n; i++){
            for(int j=0; j<2; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i][0] > a[j][0]){
                    int tmp = a[i][0];
                    int tmp2 = a[i][1];
                    a[i][0] = a[j][0];
                    a[i][1] = a[j][1];
                    a[j][0] = tmp;
                    a[j][1] = tmp2;

                }
            }
        }

        int TotalTime = 0;
        for(int i=0; i<n; i++){
            int arrTime = a[i][0];
            int checkDuration = a[i][1];
            if(TotalTime < arrTime){
                TotalTime = arrTime;
            }
            TotalTime+=checkDuration;
        }
        System.out.println(TotalTime);

    }
}
