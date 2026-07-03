import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        System.out.print("Please Enter the radius : ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.14;
        System.out.print("Volume of Sphere is : ");
        System.err.println(4/3*pi*r*r*r);
        sc.close(); // Good Practice
    }
}