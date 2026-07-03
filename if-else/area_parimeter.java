import java.util.Scanner;

public class area_parimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int b = sc.nextInt();
        int perimeter = (l+b);
        int area = (l*b);
        if (area > 2*perimeter) {
            System.out.println("Area is greater than perimeter.");
        }
        else{
            System.out.println("Perimeter is grater than area.");
        }
        sc.close();
    }
}
