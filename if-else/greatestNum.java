import java.util.Scanner;

public class greatestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number:");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number:");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number:");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("First number is greatest.");
        }
        else if (num2 > num3 && num2 > num1) {
            System.out.println("2md Number is greatest.");
        }
        else{
            System.out.println("3rd Number is greatest.");
        }
        sc.close();
    }
} 