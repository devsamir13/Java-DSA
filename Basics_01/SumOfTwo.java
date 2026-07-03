import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner samir = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        int a = samir.nextInt();
        System.out.print("Enter the second value : ");
        int b = samir.nextInt();
        System.out.print("Enter the third value : ");
        int c = samir.nextInt();
        System.out.println(a+b+c);
        samir.close();
    }
}