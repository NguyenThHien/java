import java.util.Scanner;

public class ChuanHoaHoTen_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            String[] words = s.trim().split("\\s+");
            StringBuilder res = new StringBuilder();
            for(String word : words){
                if(!word.isEmpty()){
                    String w = word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase();
                    res.append(w);
                    res.append(" ");

                }
            }
            System.out.println(res.toString().trim());
        }
    }
}
