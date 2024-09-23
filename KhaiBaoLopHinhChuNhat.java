import java.util.Scanner;

class Rectange{
    private double width, height;
    private String color;
    public Rectange(double width, double height){
        this.width =1;
        this.height =1;
    }
    public Rectange(double width, double height, String color){
        this.width =width;
        this.height = height;
        this.color = color;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(double width){
        return width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getHeight(double height){
        return height;
    }
    public String getColor(String color){
        return color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();

    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return width*height;
    }
    public double findPerimeter(){
        return (width+height)*2;
    }
}
public class KhaiBaoLopHinhChuNhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        if(a <= 0  || b <= 0){
            System.out.println("INVALID");
            return;
        }
        String s = in.next();
        Rectange p1 = new Rectange(a, b, s);
        int x = (int)p1.findPerimeter();
        int y = (int)p1.findArea();
        String res = p1.getColor(s);

        System.out.println(x+" "+y+" "+res);




    }
}
