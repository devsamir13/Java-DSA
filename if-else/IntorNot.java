import java.util.Scanner;

public class intORnot {
    public static void main(String[] args) {
        System.out.print("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextInt();
        // int x = (int)num;
        if (num == (int)num) {
            System.out.println("Number is integer.");
        }
        else{
            System.out.println("Not a integer.");
        }
        sc.close();
    }
}
