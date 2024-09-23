import java.lang.*;
import java.util.Scanner;
class Point {
    private double x, y;
    public Point(){

    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Point (Point p){
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public double distance (Point p){
        double dx = this.x - p.x;
        double dy = this.y - p.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    double distance(Point a, Point b) {
        double dx = a.x - b.x;
        double dy = a.y - b.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
    @Override
    public String toString() {
        return x + " " + y;
    }


}
public class KhaiBaoLopPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point(x, y);
            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x, y);
            System.out.printf("%.4f\n", a.distance(b));
        }
    }
}
