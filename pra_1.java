//This program is run by Dhruv Vekariya(21CE152)
import java.util.Scanner;
public class pra_1 {
    public static void main(String[] args)
    {
        circle c1 = new circle();
        System.out.println("Area of circle : " + c1.getArea());
        System.out.println("Parimeter of circle : " + c1.getParimeter());
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of circle : ");
        double radius = sc.nextDouble();
        circle c2 = new circle(radius);
        System.out.println("Area of circle : " + c2.getArea());
        System.out.println("Parimeter of circle : " + c2.getParimeter());
        System.out.println("This program is run by Dhruv Vekariya(21CE152)");
    }
}