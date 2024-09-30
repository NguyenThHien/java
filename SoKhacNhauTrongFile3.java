import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SoKhacNhauTrongFile3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectInputStream myObj = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> myList = (ArrayList<Integer>) myObj.readObject();
        int[] a = new int[1005];
        for(int i: myList){
            a[i]++;
        }
        for(int i=0; i<=1000; i++){
            if(a[i] > 0) System.out.println(i + " " + a[i]);
        }
        myObj.close();



    }
}
