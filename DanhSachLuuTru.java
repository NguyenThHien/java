import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class KhachHang implements Comparable<KhachHang>{
    private String maKH, tenKH, maP, ngayDen, ngayDi;
    public KhachHang(){};
    public KhachHang(String maKH, String tenKH, String maP, String ngayDen, String ngayDi){
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.maP = maP;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public String getMaP() {
        return maP;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public String getNgayDi() {
        return ngayDi;
    }
    public long soNgay(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate den = LocalDate.parse(ngayDen, formatter);
        LocalDate di = LocalDate.parse(ngayDi, formatter);
        long  x = ChronoUnit.DAYS.between(den, di);
        return x;
    }
    @Override
    public int compareTo(KhachHang o) {
        long x = this.soNgay() - o.soNgay();
        if (x < 0) {
            return 1; // this nhỏ hơn o
        } else if (x > 0) {
            return -1; // this lớn hơn o
        } else {
            return 0; // this bằng o
        }
    }
    @Override
    public  String toString(){
        return maKH + " " + tenKH + " " + maP + " " + soNgay();
    }
}
public class DanhSachLuuTru {
    public static void main(String[] args) throws IOException {
        Scanner myRe = new Scanner(new File("KHACH.in"));
        int n = 0;
        int i = 0;
        if(myRe.hasNextLine()){
            String s = myRe.nextLine();
            n = Integer.parseInt(s);
        }
        KhachHang[] a = new KhachHang[n];
        while (myRe.hasNextLine()){
            String ma;
            if( i < 9){
                ma = String.format("KH0%d", i+1);
            }
            else {
                ma = String.format("KH%d", i+1);
            }
            String ten = myRe.nextLine();
            String maP = myRe.nextLine();
            String ngDen = myRe.nextLine();
            String ngDi = myRe.nextLine();
            a[i] = new KhachHang(ma, ten, maP, ngDen, ngDi);
            i++;
        }
        Arrays.sort(a);
        for(KhachHang b : a){
            String s = b.toString();
            System.out.println(s);
        }
    }
}
