
import java.util.Scanner;
public class SapXepChen {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int n = test.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = test.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int id = i;
            while (id > 0 && a[id] < a[id - 1]) {
                int tmp = a[id];
                a[id] = a[id - 1];
                a[id - 1] = tmp;
                id--;
            }
            System.out.print("Buoc "+i+": ");
            for(int k=0; k<=i; k++){
                System.out.print(a[k] +" ");
            }
            System.out.println();
        }
    }
}
