import java.math.BigInteger;
import java.util.Scanner;
class PhanSo{
    private long tuso, mauso;
    public PhanSo(){

    }
    public PhanSo(long tuso, long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public long getTuSo(){
        return tuso;
    }
    public long getMauso(){
        return mauso;
    }

    public void rutGon(){

        BigInteger gcd  = BigInteger.valueOf(tuso).gcd(BigInteger.valueOf(mauso));
        tuso = tuso / gcd.longValue();
        mauso = mauso / gcd.longValue();
        System.out.print(tuso+"/"+mauso);

    }
}
public class KhaiBaoLopPhanSo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        PhanSo p1 = new PhanSo(a, b);
        p1.rutGon();

    }
}
