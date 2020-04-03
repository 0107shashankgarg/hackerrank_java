import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            String formatted = String.format("%03d", x);
            System.out.printf("%-15s %s\n", s1, formatted);
        }
        System.out.println("================================");

    }
}
