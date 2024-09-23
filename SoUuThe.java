import java.util.Scanner;

public class SoUuThe {
    public static boolean check(String s){
        int len = s.length();
        int cnt_chan = 0, cnt_le = 0;
        for(int i=0; i<s.length(); i++){
            int x = s.charAt(i) - '0';
            if(x % 2 == 0){
                cnt_chan++;
            } else cnt_le++;
        }
        if(cnt_le > cnt_chan && len%2 == 1) return true;
        if(cnt_chan > cnt_le && len%2 == 0) return true;
        return false;
    }
    public static boolean check1(String s){
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if((x >= 'a' && x <='z') || (x >= 'A' && x<='Z')){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        while (t-->0){
            String s = in.next();
            if(!check1(s)){
                System.out.println("INVALID");
            }else{
                if(check(s)){
                    System.out.println("YES");
                }else System.out.println("NO");
            }

        }
    }
}
