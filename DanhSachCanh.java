import java.util.Scanner;
public class DanhSachCanh {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        boolean[][] vst = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(a[i][j] == 1){
                    if(i < j){
                        System.out.println("("+(i+1)+","+(j+1)+")");

                    }
                }
            }
        }

    }
}
