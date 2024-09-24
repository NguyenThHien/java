import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.TreeSet;
public class LietKeTuKhacNhau {
    public static void main(String[] args) {
        try {
            File myObj = new File("VANBAN.in");
            Scanner myReader = new Scanner(myObj);
            Set<String> a = new TreeSet<>();
            while(myReader.hasNext()){
                String s = myReader.next().toLowerCase();
                a.add(s);

            }
            for(String i : a){
                System.out.println(i);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
