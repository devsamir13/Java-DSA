import java.util.Scanner;

public class ternaryInVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int samir = (num>=0) ? 100: 0;
        System.out.println(samir);
        sc.close();
    }
}
