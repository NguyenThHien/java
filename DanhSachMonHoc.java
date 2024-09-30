import java.io.IOException;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

class MonHoc implements Comparable<MonHoc>{
    private String maM, tenM;
    private int sotin;
    public MonHoc(){};
    public MonHoc(String maM, String tenM, int sotin){
        this.maM = maM;
        this.tenM = tenM;
        this.sotin = sotin;
    }

    public String getMaM() {
        return maM;
    }

    public String getTenM() {
        return tenM;
    }

    public int getSotin() {
        return sotin;
    }
    @Override
    public String toString(){
        return maM + " " + tenM + " " + sotin;
    }
    @Override
    public int compareTo(MonHoc a){
        return this.tenM.compareTo(a.tenM);
    }

}
public class DanhSachMonHoc {
    public static void main(String[] args) throws IOException {
        File myObj = new File("MONHOC.in");
        Scanner myReader = new Scanner(myObj);
        int n = 0;
        if(myReader.hasNextLine()){
            String s = myReader.nextLine();
            n = Integer.parseInt(s);
        }
        MonHoc[] a = new MonHoc[n];
        int i = 0;
        while (myReader.hasNextLine()){
            String ma = myReader.nextLine();
            String ten = myReader.nextLine();
            String st = myReader.nextLine();
            int soTin = Integer.parseInt(st);
            a[i] = new MonHoc(ma, ten, soTin);
            i++;
        }
        Arrays.sort(a);
        for(MonHoc b : a){
           String x = b.toString();
           System.out.println(x);
        }
    }

}
