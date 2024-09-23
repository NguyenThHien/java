import java.util.Scanner;

public class XauDoiXung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            int r = s.length()-1;
            int l = 0;
            int cnt = 0;
            while (l <=r){
                if(s.charAt(l) != s.charAt(r)) cnt++;
                l++; r--;
            }
            if(cnt == 0 && s.length()%2==0) System.out.println("NO");
            else if (cnt == 0 && s.length()%2 == 1) System.out.println("YES");
            else if(cnt == 1) System.out.println("YES");
            else System.out.println("NO");

        }


    }
}
