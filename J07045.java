import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
class LoaiPhong implements Comparable<LoaiPhong> {
    private String kyHieu;
    private String ten;
    private int donGia;
    private double phiPhucVu;

    public LoaiPhong() {
    }

    ;

    public LoaiPhong(String line) {
        String[] parts = line.split("\\s+");
        this.kyHieu = parts[0];
        this.ten = parts[1];
        this.donGia = Integer.parseInt(parts[2]);
        this.phiPhucVu = Double.parseDouble(parts[3]);
    }

    public String getKyHieu() {
        return kyHieu;
    }

    public String getTen() {
        return ten;
    }

    public int getDonGia() {
        return donGia;
    }

    public double getPhiPhucVu() {
        return phiPhucVu;
    }

    @Override
    public int compareTo(LoaiPhong o) {
        return this.ten.compareTo(o.ten);
    }

    @Override
    public String toString() {
        return kyHieu + " " + ten + " " + donGia + " " + phiPhucVu;
    }
}

    public class J07045 {
        public static void main(String[] args) throws IOException {
            ArrayList<LoaiPhong> ds = new ArrayList<>();
            Scanner in = new Scanner(new File("PHONG.in"));
            int n = Integer.parseInt(in.nextLine());
            while (n-- > 0) {
                ds.add(new LoaiPhong(in.nextLine()));
            }
            Collections.sort(ds);
            for (LoaiPhong tmp : ds) {
                System.out.println(tmp);
            }
        }
    }

