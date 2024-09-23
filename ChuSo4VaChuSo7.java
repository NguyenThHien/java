import java.util.Scanner;
public class ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        String s = test.nextLine();
        int cnt4 = 0;
        int cnt7 = 0;
        for(char ch: s.toCharArray()){
            if(ch == '4'){
                cnt4++;
            } else if (ch == '7') {
                cnt7++;

            }
        }
        int sum = cnt7+cnt4;
        if(sum == 4 || sum == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

