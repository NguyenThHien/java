import java.util.Scanner;

class GiaoVien {
    private String maNgach, ten;
    private long luong, thuNhap, phuCap;

    public GiaoVien() {}

    public GiaoVien(String maNgach, String ten, long luong) {
        this.maNgach = maNgach;
        this.ten = ten;
        this.luong = luong;
    }

    public long getLuong() {
        return luong;
    }

    public String getMaNgach() {
        return maNgach;
    }

    public String getTen() {
        return ten;
    }

    public long getThuNhap() {
        String s = maNgach.substring(0, 2);
        long x = Long.parseLong(maNgach.substring(2, 4));
        thuNhap = luong * x;

        if (s.equals("HT")) {
            thuNhap += 2000000;
        } else if (s.equals("HP")) {
            thuNhap += 900000;
        } else {
            thuNhap += 500000;
        }
        return thuNhap;
    }

    public long getPhuCap() {
        String s = maNgach.substring(0, 2);
        if (s.equals("HT")) {
            phuCap = 2000000;
        } else if (s.equals("HP")) {
            phuCap = 900000;
        } else {
            phuCap = 500000;
        }
        return phuCap;
    }

    public void input() {
        Scanner in = new Scanner(System.in);
        this.maNgach = in.nextLine();
        this.ten = in.nextLine();
        this.luong = in.nextLong();
        in.nextLine(); // Consume newline
    }

    public void output() {
        long x = Long.parseLong(maNgach.substring(2, 4));
        System.out.printf("%s %s %d %d %d%n", maNgach, ten, x, getPhuCap(), getThuNhap());
    }
}

public class TinhThuNhapGiaoVien {
    public static void main(String[] args) {
        GiaoVien p = new GiaoVien();
        p.input();
        p.output();
    }
}