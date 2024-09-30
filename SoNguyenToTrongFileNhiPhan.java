import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SoNguyenToTrongFileNhiPhan {
    public static boolean checkNT(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream myObj = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> myList = (ArrayList<Integer>) myObj.readObject();
        ArrayList<Integer> res = new ArrayList<>();
        int[] a = new int[10002];
        for(int i : myList){
            if(checkNT(i)) res.add(i);
        }
        for(int i : res){
            a[i]++;
        }
        for(int i=0; i<=10000; i++){
            if(a[i] > 0) System.out.println(i + " " + a[i]);
        }
        myObj.close();
    }
}
