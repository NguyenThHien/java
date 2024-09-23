import java.util.Scanner;
public class BSNNCuaNSoNguyenDuongDauTien {
    static long ucll(long a, long b){
        if(b == 0){
            return a;
        }
        return ucll(b, a%b);
    }
    static long bcnn(long a, long b){
        return (a*b)/ucll(a, b);
    }
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int t= test.nextInt();
        while(t > 0){
            long  n = test.nextLong();
            long res = 1;
            for(long i=1; i<=n; i++){
                res = bcnn(res, i);
            }
            System.out.println(res);
            t--;

        }
    }
}
