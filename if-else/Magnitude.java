import java.util.Scanner;

public class Magnitude {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > -69 && num < 69) {
            System.out.println("The magnitude is smaller than 69.");
        }
        else{
            System.out.println("The magnitude is NOT smaller than 69.");
        }
        sc.close();
    }
}
