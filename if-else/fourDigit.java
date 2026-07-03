import java.util.Scanner;

public class fourDigit {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 999 && num < 10000) {
            System.out.println("This is a four digit number.");
        }
        else{
            System.out.println("Not a four digit number");
        }
        sc.close();
    }
}