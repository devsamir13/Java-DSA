import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Please Enter the radius : ");
        Scanner sc = new Scanner(System.in); // for input
        double r = sc.nextDouble();
        double pi = 3.14;
        System.out.print("Area is : ");
        System.out.println(pi*r*r);
        sc.close(); // Good Practice
    }
}