import java.util.Scanner;

public class divide5 {
    public static void main(String[] args) {
        System.out.print("Enter the Number:");
        Scanner sm = new Scanner(System.in);
        int num = sm.nextInt();
        if (num % 5 == 0) {
            System.out.println("Given Number is Divisible by 5.");
        }
        sm.close();
    }
}
