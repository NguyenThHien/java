import java.util.Scanner;
class Matran{
    private int n;
    private int[][] a;
    public Matran(int n) {
        this.n = n;
        a = new int[n][n];
    }
    public Matran(int[][] a) {
        this.n = a.length;
        this.a = a;
    }
    public int[][] getMatran() {
        return a;
    }
    public int getKT() {
        return n;
    }
    public void input(Scanner in) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }
    }
    public void out() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public Matran tong(int[][] b) {
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = this.a[i][j] + b[i][j];
            }
        }
        return new Matran(result);
    }
}


public class baitaptrenlop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //nhap kich thuoc
        int n=sc.nextInt();
        Matran m=new Matran(n);
        //nhap ma tran a
        m.input(sc);
        Matran b=new Matran(m.getKT());
        //nhap ma tran b
        b.input(sc);
        Matran t=m.tong(b.getMatran());
        //viet ra ma tran tong
        t.out();
    }
}
