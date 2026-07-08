package Oops.ClassesJava;

interface AreaCalculator{
    public double triangle(double b,double h);
}
public class Lambda {
    public static void main(String[] args) {
        AreaCalculator tri = (double b, double h) -> 0.5*b*h;
        System.out.println(tri.triangle(10.4d,5.23d));
    }
}
