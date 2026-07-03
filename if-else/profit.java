import java.util.Scanner;

public class profit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price of item: ");
        int cost = sc.nextInt();
        System.out.print("Enter Selling price of item: ");
        int selling = sc.nextInt();
        if (selling > cost) {
            System.out.print("Seller make the profit of Rs. "+ (selling-cost));
        }
        else if (selling == cost) {
            System.out.print("Seller make No profit No loss.");
        }
        else{
            System.out.print("Seller make the loss of Rs. "+ (cost-selling));
        }
        sc.close();
    }
}