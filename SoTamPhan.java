import java.util.Scanner;
public class SoTamPhan {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int t = test.nextInt();

        while( t>0){
            String s= test.next();
            int cnt_0 = 0;
            int cnt_1 = 0;
            int cnt_2 = 0;
            for (char x : s.toCharArray() ){
                if(x == '0'){
                    cnt_0++;
                }else if(x == '1'){
                    cnt_1++;
                }else if(x == '2'){
                    cnt_2++;
                }
            }
            int sum = cnt_1+cnt_0+cnt_2;
            if(sum == s.length()){
                System.out.println("YES");

            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
