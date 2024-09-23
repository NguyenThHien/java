import java.util.Scanner;
public class SapXepChon {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int n = test.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = test.nextInt();
        }
        for(int i=0; i<n-1; i++){
            int idex = i;
            for(int j=i+1; j<n; j++){
                if(a[j] < a[idex]){
                    idex = j;
                }
            }
            int tmp = a[i];
            a[i] = a[idex];
            a[idex] = tmp;
            System.out.print("Buoc " + (i+1) +": ");
            for(int k=0; k<n; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }

    }
}
