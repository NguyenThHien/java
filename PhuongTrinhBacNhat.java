import java.util.Scanner;
public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);
        float a = test.nextFloat();
        float b = test.nextFloat();
        if(a == 0f){
            if(b == 0f){
                System.out.println("VSN");
            } else{
                System.out.println("VN");
            }
        } else{
            System.out.println(String.format("%.2f", -b / a));
        }
    }
}
