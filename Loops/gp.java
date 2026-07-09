import java.util.Scanner;

public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the terms : ");
        int n = sc.nextInt();
        int a = 1, r = 2;
        for (int i = 0; i <= n ; i++) {
            System.out.println(a+" ");
            a *= r;
        }
        sc.close();
    }
}
