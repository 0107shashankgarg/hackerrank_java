
import java.util.Scanner;

public class loop2 {

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = 0;
            sum = a + (((int) Math.pow(2.0, 0) * b));
            System.out.print(sum + " ");
            for (int k = 1; k < n; k++) {
                sum = sum + (((int) Math.pow(2.0, k) * b));
                System.out.print(sum + " ");

            }
            System.out.println("");

        }
    }
}