import java.util.Scanner;
class NV{
    private String maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHD;
    public NV( String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKiHD){
        this.maNV = "00001";
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngayKiHD = ngayKiHD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public String getNgayKiHD() {
        return ngayKiHD;
    }
    public void  output(){
        System.out.printf("%s %s %s %s %s %s %s", maNV, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue , ngayKiHD);

    }
}
public class KhaiBaoLopNhanVien {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            String hoTen = in.nextLine();
            String gt = in.nextLine();
            String ns = in.nextLine();
            String dc = in.nextLine();
            String st = in.nextLine();
            String nkhd = in.nextLine();
            NV p1 = new NV(hoTen, gt, ns, dc, st, nkhd);
            p1.output();
        }catch (Exception e){
            return;
        }
    }
}
