import java.util.Scanner;

public class ChuanHoaHoTen_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        while(t-->0){
            String s = in.nextLine();
            String[] words = s.trim().split("\\s+");
            StringBuilder res = new StringBuilder();
            for(int i = 1; i< words.length; i++){
                if(!words[i].isEmpty()){
                    String w = words[i].substring(0, 1).toUpperCase()+words[i].substring(1).toLowerCase();
                    res.append(w);
                    if(i!= words.length-1){
                        res.append(" ");
                    }

                }
            }
            res.append(", ");
            res.append(words[0].toUpperCase());

            System.out.println(res.toString().trim());
        }
    }
}
