import java.util.*;
public class q6 {
    void area (float a) {
        System.out.println("the area of the square is "+a*a+" sq units");
    }
    void area (float l, float b) {
        System.out.println("the area of the rectangle is "+l*b+" sq units");
    }
    void area(double r) {
        System.out.println("the area of the circle is "+3.14*r*r+" sq units");
    }
    public static void main(String args[]) {
	   q6 ob = new q6();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter length of a side of the square : ");
       float a = sc.nextFloat();
	   ob.area(a);
       System.out.println("Enter length  and breadth of the rectangle : ");
       float l = sc.nextFloat();
       float b = sc.nextFloat();
	   ob.area(l, b);
       System.out.println("Enter length of the radius of the circle : ");
       double r = sc.nextDouble();
	   ob.area(r);
    }
}