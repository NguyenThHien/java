import java.util.Scanner;

public class Sodep_1 {
    public static boolean check(String s){
        for(int i=0; i<s.length(); i++){
            int x = s.charAt(i);
            if ( x % 2 == 1){
                return  false;
            }
        }
        return true;
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
