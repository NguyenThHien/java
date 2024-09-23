import  java.util.Scanner;
import java.util.Stack;
public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = in.nextInt();

        }
        Stack<Integer> stack = new Stack<>();
        for(int num : a){
            if(!stack.empty() && (stack.peek()+num)%2 == 0){
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        System.out.println(stack.size());

    }
}
