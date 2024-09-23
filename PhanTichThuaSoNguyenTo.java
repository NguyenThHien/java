import java.util.Scanner;
public class PhanTichThuaSoNguyenTo {
    public static void phanTich(int n){
        for(int i = 2; i <= Math.sqrt((n)); i++){
            int cnt = 0;
            while(n%i == 0){
                cnt ++;
                n/=i;
            }
            if(cnt != 0){
                System.out.print(i);
                System.out.print("(");
                System.out.print(cnt);
                System.out.print(") ");
            }

        }
        if(n != 1){
            System.out.print(n);
            System.out.print("(");
            System.out.print(1);
            System.out.print(")");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        int dem = 1;
        while(T > 0){
            int n = test.nextInt();
            System.out.print("Test ");
            System.out.print(dem);
            System.out.print(":");

            phanTich(n);
            dem ++;
            T --;


        }
    }
}
