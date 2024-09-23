import java.util.*;

public class TapTuRiengCua2Xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String[] listString1 = s1.split("\\s+");
            String s2 = sc.nextLine();
            String[] listString2 = s2.split("\\s+");
            List<String> stringList = new ArrayList<>();
            for(String word : listString2) {
                stringList.add(word);
            }

            Set<String> stringSet = new TreeSet<>();
            for(String word : listString1) {
                if(!stringList.contains(word)) {
                    stringSet.add(word);
                    stringList.add(word);
                }
            }

            for(String word : stringSet) {
                System.out.print(word + " ");
            }
            System.out.println();
        }
    }
}
