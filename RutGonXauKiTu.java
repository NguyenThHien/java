import java.util.Scanner;
import java.util.Stack;

public class RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == ch){
                st.pop();
            } else st.push(ch);
        }
        if(st.isEmpty()){
            System.out.println("Empty String");
        }
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        System.out.println(res.reverse().toString());
    }
}
