import java.util.Scanner;

public class leastNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number:");
        int num3 = sc.nextInt();
        // if (num1 < num2 && num1 < num3) {
        //     System.out.println("First number is least Number.");
        // }
        // else if (num2 < num3 && num2 < num1) {
        //     System.out.println("2nd Number is least Number.");
        // }
        // else{
        //     System.out.println("3rd Number is least Number.");
        // }

        if (num1 < num2) {
            if (num1 < num3) {
             System.out.println("First number is least Number.");   
            }
            else{
                System.out.println("3rd Number is least Number.");
            }
        }
        else{
            if (num2 < num3) {
                if (num2 < num1) {
                 System.out.println("2nd Number is least Number.");   
                }
                else{
                    System.out.print("1st Number is the least Number.");
                }
            }
            else{
                System.out.println("3rd Number is least Number.");
            }
        }
        sc.close();
    }   
} 