import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class ChuanHoaXauHoTenTrongFile {
    public static void main(String[] args) throws IOException{
        File myObj = new File("DATA.in");
        Scanner myReader = new Scanner(myObj);
        ArrayList<String> results = new ArrayList<>();
        while(myReader.hasNextLine()){
            String s = myReader.nextLine().trim();
            if(s.equals("END")) return;
            String[] a = s.split("\\s+");
            StringBuilder res = new StringBuilder();
            for(int i = 0; i< a.length; i++){
                if(!a[i].isEmpty()){
                    String w = a[i].substring(0, 1).toUpperCase()+a[i].substring(1).toLowerCase();
                    res.append(w);
                    if(i!= a.length-1){
                        res.append(" ");
                    }
                }
            }
            System.out.println(res.toString());

        }

    }
}
