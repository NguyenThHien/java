import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.io.File;
import java.util.Scanner;

class DN implements Comparable<DN>{
    private String maDN, tenDN;
    private int soluongSV;
    public DN(){};
    public DN(String maDN, String tenDN, int soluongSV){
        this.maDN = maDN;
        this.tenDN = tenDN;
        this.soluongSV = soluongSV;
    }

    public String getMaDN() {
        return maDN;
    }

    public String getTenDN() {
        return tenDN;
    }

    public int getSoluongSV() {
        return soluongSV;
    }
    @Override
    public int compareTo(DN o){
        return this.maDN.compareTo(o.maDN);
    }
    @Override
    public String toString(){
        return maDN+ " " +tenDN+ " " +soluongSV;
    }
}
public class DanhSachDoanhNghiep {
    public static void main(String[] args)throws IOException {
        File myObj = new File("DN.in");
        Scanner myReader = new Scanner(myObj);
        int n = 0;
        if(myReader.hasNextLine()){
            String s = myReader.nextLine();
            n = Integer.parseInt(s);
        }
        DN[] a = new DN[n];
        int i = 0;
        while (myReader.hasNextLine()){
            String ma = myReader.nextLine();
            String ten = myReader.nextLine();
            String s = myReader.nextLine();
            int soLuongSV = Integer.parseInt(s);
            a[i] = new DN(ma, ten, soLuongSV);
            i++;
        }
        Arrays.sort(a);
        for(DN b : a){
            String s = b.toString();
            System.out.println(s);
        }
    }
}
