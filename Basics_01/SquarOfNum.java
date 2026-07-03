import java.util.Scanner;

public class SquarOfNum {
    public static void main(String[] args) {
        System.out.print("Enter a value : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(x*x);
        sc.close();
    }
}
