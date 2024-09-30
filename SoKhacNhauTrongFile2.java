import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;
public class SoKhacNhauTrongFile2 {
    public static void main(String[] args) throws IOException {
        DataInputStream myObj = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] a = new int[1005]; // mang danh dau
        for(int i=0; i<100000; i++){
            a[myObj.readInt()]++;
        }
        for(int i=0; i<=1000; i++){
            if(a[i] > 0){
                System.out.println(i + " " + a[i]);
            }
        }
        myObj.close();
    }
}
