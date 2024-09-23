import java.util.Scanner;
public class HinhChuNhat{
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        long n = test.nextLong();
        long m = test.nextLong();
        if(n <=0 || m <=0){
            System.out.print("0");
        }
        else{
            long chuVi = (n+m)*2;
            long dienTich = n*m;
            System.out.print(chuVi);
            System.out.print(" ");
            System.out.print(dienTich);
        }

        test.close();

    }
}
