import java.util.Scanner;
import java.math.BigInteger;
class PS{
    private long tu, mau;
    public PS(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    public long getMau(){
        return mau;
    }

    public long getTu() {
        return tu;
    }
    public void rutgon(){
        BigInteger gcd  = BigInteger.valueOf(tu).gcd(BigInteger.valueOf(mau));
        tu = tu / gcd.longValue();
        mau = mau / gcd.longValue();
        System.out.print(tu+"/"+mau);

    }
    public void tong(PS b){
        this.tu = this.tu*b.getMau()+b.getTu()*this.mau;
        this.mau = this.mau*b.getMau();
        this.rutgon();
    }
}
public class TongPhanSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a= in.nextLong();
        long b= in.nextLong();
        long c= in.nextLong();
        long d= in.nextLong();
        PS p1 = new PS(a, b);
        PS p2 = new PS(c, d);
        p1.tong(p2);
    }

}
