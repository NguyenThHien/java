import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
class SinhVien{
    private String maSV, tenSV, ngaySinh, lop;
    private float gpa;
    public SinhVien(){};
    public SinhVien(String maSV, String tenSV, String lop, String ngaySinh, float gpa){
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public String getLop() {
        return lop;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public float getGpa() {
        return gpa;
    }
    public void out(){
        System.out.printf("%s %s %s %s %.2f", maSV, tenSV, lop, Format(), gpa);

    }
    public String Format(){
        try{
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date date = f.parse(ngaySinh);
            return f.format(date);
        } catch (ParseException e) {
            return ngaySinh;
        }
    }
}
public class DanhSachSinhVienTrongFile2 {
    public static void main(String[] args) {
       try {
           SinhVien[] a = new SinhVien[50];
           File myObj = new File("SV.in");
           Scanner myReader = new Scanner(myObj);
           int x = 0;
           int n = 0;
           if(myReader.hasNextLine()){
               String s = myReader.nextLine();
               n = Integer.parseInt(s);
           }
           while (myReader.hasNextLine()){
               StringBuilder res = new StringBuilder();
               if(x < 9){
                   res.append("B20DCCN00");
                   res.append(x+1);
               }else if (x < 99 ){
                   res.append("B20DCCN0");
                   res.append(x+1);
               }else{
                   res.append("B20DCCN");
                   res.append(x+1);
               }
               String maSV = res.toString();
               String tenSV = myReader.nextLine();
               String lop = myReader.nextLine();
               String ngaySinh = myReader.nextLine();
               String  gpa = myReader.nextLine();
               float  DTB = Float.parseFloat(gpa);
               a[x] = new SinhVien(maSV, tenSV, lop,ngaySinh, DTB);
               x++;
           }
           for(int i=0; i<n; i++){
               a[i].out();
               System.out.println();
           }
           myReader.close();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }

    }
}
