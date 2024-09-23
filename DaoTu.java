import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DaoTu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();

        while (t-- > 0) {
            String s = in.nextLine();
            List<String> reversedWords = new ArrayList<>();

            // Split the string by whitespace
            String[] words = s.split("\\s+");

            // Reverse each word and add to the list
            for (String word : words) {
                String reversedWord = new StringBuilder(word).reverse().toString();
                reversedWords.add(reversedWord);
            }

            // Print the reversed words in reverse order
            for (int i = 0; i <reversedWords.size(); i++) {
                System.out.print(reversedWords.get(i));
                if (i != reversedWords.size()-1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        in.close();
    }
}