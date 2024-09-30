import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CapSoNguyenToTrongFile_1 {
    public static boolean isPrime(int n){
        if(n < 2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream myObj = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> list1 = (ArrayList<Integer>) myObj.readObject();
        myObj.close();
        ObjectInputStream myObj2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> list2 = (ArrayList<Integer>) myObj2.readObject();
        myObj2.close();
        LinkedHashSet<Integer> primeList1 = new LinkedHashSet<>();
        LinkedHashSet<Integer> primeList2 = new LinkedHashSet<>();
        for(int i: list1){
            if(isPrime(i)) primeList1.add(i);
        }
        for(int i: list2){
            if(isPrime(i)) primeList2.add(i);
        }
        ArrayList<String> pairs = new ArrayList<>();
        for(int n : primeList1){
            int m = 1000000-n;
            if(n < m && primeList2.contains(m)){
                pairs.add(n+ " " +m);
            }
        }
        for(String i : pairs){
            System.out.println(i);
        }

    }
}