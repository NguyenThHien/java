import java.util.Scanner;
public class TichMaTranChuyenViCuaNo {
    public static void nhan2Mtra(int[][] a, int[][] b, int n, int m){
        int[][] c = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                c[i][j] = 0;
                for(int k=0; k<m; k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int cnt = 1;
        while(t-->0){

            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] =b[j][i]= in.nextInt();
                }
            }
            System.out.println("Test "+cnt+":");
            nhan2Mtra(a, b, n, m);
            cnt++;

        }
    }
}
