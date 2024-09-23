import java.util.Scanner;

class P {
    private double x, y;

    // Default constructor
    public P() {}

    // Parameterized constructor
    public P(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    public P(P a) {
        this.x = a.x;
        this.y = a.y;
    }

    // Getters for x and y
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Calculate distance between this point and another point
    public double distance(P b) {
        double dx = this.x - b.x;
        double dy = this.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(P a, P b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return x+" "+y;
    }
}

public class ChuViTamGiac {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-->0){

            P p1 = new P(in.nextDouble(), in.nextDouble());
            P p2 = new P(in.nextDouble(), in.nextDouble());
            P p3 = new P(in.nextDouble(), in.nextDouble());
            double dis1 = p1.distance(p2);
            double dis2 = p2.distance(p3);
            double dis3 = p3.distance(p1);
            if(dis1+dis2 <= dis3 || dis2+dis3 <= dis1 || dis1+dis3 <= dis2){
                System.out.println("INVALID");
            }
            else{
                double perimeter = dis1 + dis2 + dis3;
                System.out.printf("%.3f%n", perimeter);
            }
        }

    }
}