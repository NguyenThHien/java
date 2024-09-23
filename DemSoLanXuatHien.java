import java.util.Scanner;
public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        int t = test.nextInt();
        int dem = 1;
        while(t > 0){
            t--;
            int n = test.nextInt();
            int[] a = new int[n];
            int[] dd = new int[100005];
            for(int i=0; i<n; i++){
                a[i] = test.nextInt();
                dd[a[i]]++;
            }
            System.out.println("Test " + dem +":");
            for(int i=0; i<n; i++){
                if(dd[a[i]] > 0){
                    System.out.println(a[i] +" xuat hien "+dd[a[i]] +" lan");
                    dd[a[i]] = 0;
                }
            }
            dem+=1;
        }
    }
}
