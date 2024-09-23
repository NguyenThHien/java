import java.util.Scanner;
public class DiemCanBang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++){
                a[i] = in.nextInt();
                sum+=a[i];
                if(i==0){
                    b[i] = a[i];
                }else{
                    b[i] = b[i-1]+a[i];
                }
            }

            int k = 1;
            for(int i=1; i<n; i++){
                if(b[i-1] == sum-b[i]){
                    System.out.println(i+1);
                    k = 0;
                    break;
                }
            }
            if(k == 1){
                System.out.println("-1");
            }

        }
    }

}
