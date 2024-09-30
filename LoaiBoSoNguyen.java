import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LoaiBoSoNguyen {
    public static void main(String[] args) throws IOException {
        File myObj = new File("DATA.in");
        Scanner myReader = new Scanner(myObj);
        ArrayList<String> res = new ArrayList<>();
        while (myReader.hasNext()){
            String s = myReader.next();
            try {
                int x = Integer.parseInt(s);
            } catch (NumberFormatException e) {
                res.add(s);
            }
        }
        Collections.sort(res);
        for(String i : res){
            System.out.print(i + " ");
        }
    }
}
