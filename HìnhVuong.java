import java.util.Arrays;
import java.util.Scanner;

public class HìnhVuong {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];

        for(int i=0; i<4; i++){
            a[i] = test.nextInt();
            b[i] = test.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int x = Math.max(a[3]-a[0], b[3]-b[0]);
        int s = x * x;
        System.out.println(s);


    }
}

