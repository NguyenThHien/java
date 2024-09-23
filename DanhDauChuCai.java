import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Set<Character> a = new HashSet<>();
        for(char ch: s.toCharArray()){
            a.add(ch);
        }
        System.out.println(a.size());
    }
}
