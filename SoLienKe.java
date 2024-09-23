import java.util.Scanner;
public class SoLienKe {

    public static boolean check(char a, char b) {
        int x = a - '0';
        int y = b - '0';
        return Math.abs(x - y) == 2;
    }
    public static boolean tong(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += s.charAt(i) - '0';
        }
        if(sum % 10 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int T = test.nextInt();
        test.nextLine();
        while(T > 0){
            int ok = 1;
            String s = test.nextLine();
            for(int i = 1; i < s.length(); i++){
                 if(!check(s.charAt(i), s.charAt(i-1))){
                     System.out.println("NO");
                     ok = 0;
                     break;
                 }
            }
            if(ok == 1 && tong(s)){
                System.out.println("YES");
            } else if (ok == 1 && !tong(s)){
                System.out.println("NO");
            }
            T--;
        }
    }
}
