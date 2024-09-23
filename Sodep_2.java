import java.util.Scanner;

public class Sodep_2 {
    public static boolean check(String s){
        if(s.charAt(s.length()-1) != '8' || s.charAt(0) != '8'){
            return false;
        }
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i)-'0';

            sum += x;
        }

        if(sum%10 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s= in.next();
            String w = "";
            for(int i=s.length()-1; i>=0; i--){
                w += s.charAt(i);
            }

            if (w.toString().equals(s) && check(s)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
