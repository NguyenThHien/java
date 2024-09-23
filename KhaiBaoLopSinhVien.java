import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

class SV {
    private String maSV, hoTen, lop, ngaySinh;
    private float gpa;

    public SV(String hoTen, String lop, String ngaySinh, float gpa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ngaySinh = ngaySinh;
        this.gpa = gpa;
        // Generate a unique ID or use a fixed format for maSV
        this.maSV = "B20DCCN001"; // For simplicity, using a fixed ID
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public float getGpa() {
        return gpa;
    }

    public String Formatns() {
        try {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
            Date date = f.parse(ngaySinh);
            return f.format(date);
        } catch (ParseException e) {

            return ngaySinh; // Return the original date string if parsing fails
        }
    }

    public void output() {
        System.out.printf("%s %s %s %s %.2f%n", maSV, hoTen, lop, Formatns(), gpa);
    }
}

public class KhaiBaoLopSinhVien {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String hoTen = in.nextLine();
            String lop = in.nextLine();
            String ns = in.nextLine();
            float gpa = in.nextFloat();

            SV p1 = new SV(hoTen, lop, ns, gpa);
            p1.output();
        } catch (Exception e) {
            return;
        }
    }
}