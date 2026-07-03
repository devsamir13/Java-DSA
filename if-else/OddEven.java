import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.print("Please Enter The Number:");
        Scanner sm = new Scanner(System.in);
        int num = sm.nextInt();
        if (num%2==0) {
            System.out.println("The number is Even.");
        }
        else{
            System.out.println("Number is Odd.");
        }
        sm.close();
    }
}
