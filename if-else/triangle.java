import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int a = sc.nextInt();
        System.out.print("Enter the second side: ");
        int b = sc.nextInt();
        System.out.print("Enter the third side: ");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("They are the sides of a triangle.");
        }
        else{
            System.out.println("They are Not the sides of a triangle.");
        }
        sc.close();
    }
}