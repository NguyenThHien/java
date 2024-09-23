import java.util.Scanner;

public class LuaChonThamLam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        if(s==0){
            if(n==1){
                System.out.print("0 0");
            } else{
                System.out.print("-1 -1");
            }
            return;
        }
        if(s > 9*n){
            System.out.print("-1 -1");
            return;
        }
        StringBuilder numMax = new StringBuilder();
        int sum1 = s;
        for (int i = 1; i <= n; i++) {
            for(int digit = 9; digit >=0; digit--){
                if(sum1 - digit >= 0 && sum1 - digit <= 9*(n-i)){
                    numMax.append(digit);
                    sum1-=digit;
                    break;
                }
            }

        }
        int sum2 = s;
        StringBuilder numMin = new StringBuilder();
        for(int i=1; i<=n; i++){
            for(int digit = (i==1 ? 1:0); digit<=9; digit++){
                if(sum2- digit >= 0 && sum2- digit <= 9*(n-i)){
                    numMin.append(digit);
                    sum2-=digit;
                    break;
                }
            }

        }
        System.out.println(numMin +" "+numMax);
    }
}
