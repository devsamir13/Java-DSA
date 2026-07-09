public class breakContinue2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i==13) {
                continue;
            }
            System.out.print("Good morning");
        }
    }
}
