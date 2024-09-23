import java.util.Scanner;

class TS {
    private String hoTen;
    private String ngaySinh;
    private float d1, d2, d3;

    public TS(String hoTen, String ngaySinh, float d1, float d2, float d3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public float getD1() {
        return d1;
    }

    public float getD2() {
        return d2;
    }

    public float getD3() {
        return d3;
    }

    public float getTongDiem() {
        return d1 + d2 + d3;
    }

    public void output() {
        System.out.printf("%s %s %.1f%n", hoTen, ngaySinh, getTongDiem());
    }
}

public class KhaiBaoLopThiSinh {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String hoTen = in.nextLine();
            String ngaySinh = in.nextLine();
            float d1 = in.nextFloat();
            float d2 = in.nextFloat();
            float d3 = in.nextFloat();

            TS thiSinh = new TS(hoTen, ngaySinh, d1, d2, d3);
            thiSinh.output();
        } catch (Exception e) {
            return;
        }
    }
}