import java.util.Scanner;
class SP {
    private String maMH, tenMH, donVi;
    private long giaMua, giaBan;

    public SP() {}

    public SP(String maMH, String tenMH, String donVi, long giaMua, long giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH() {
        return maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public String getDonVi() {
        return donVi;
    }

    public long getGiaBan() {
        return giaBan;
    }

    public long getGiaMua() {
        return giaMua;
    }

    public long getLoiNhuan() {
        return giaBan - giaMua;
    }

    public void output() {
        System.out.printf("%s %s %s %d %d %d%n", maMH, tenMH, donVi, giaMua, giaBan, getLoiNhuan());
    }
}

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        SP[] a = new SP[n];
        in.nextLine(); // Đọc dòng còn lại

        // Nhập danh sách mặt hàng
        for (int i = 0; i < n; i++) {
            String maMH = String.format("MH%03d", i + 1); // Tạo mã mặt hàng
            String tenMH = in.nextLine();
            String donVi = in.nextLine();
            long giaMua = in.nextLong();
            long giaBan = in.nextLong();
            in.nextLine(); // Đọc dòng còn lại
            a[i] = new SP(maMH, tenMH, donVi, giaMua, giaBan);
        }
        for(int i=0; i<n; i++){
           SP p = a[i];
           for(int j=i+1; j<n; j++){
              if(a[i].getLoiNhuan() < a[j].getLoiNhuan()){
                  SP tmp = a[i];
                  a[i] = a[j];
                  a[j] = tmp;
              }else if (a[i].getLoiNhuan() == a[j].getLoiNhuan()){
                  if (a[i].getMaMH().compareTo(a[j].getMaMH()) > 0){
                      SP tmp = a[i];
                      a[i] = a[j];
                      a[j] = tmp;
                  }
              }
          }
        }
        for(int i=0; i<n; i++){
            a[i].output();
        }


    }
}
