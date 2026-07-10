import java.util.Scanner;

public class raisePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();
        int pow = 1;
        for (int i = 1; i <= b ; i++) {
            pow = pow*a;
        }
        System.out.println(pow);
        sc.close();
    }
}
