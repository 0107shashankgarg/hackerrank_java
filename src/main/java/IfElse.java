
import java.util.Scanner;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int number = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (number % 2 != 0)
            System.out.println("Weird");
        else if (number >= 2 & number <= 5)
            System.out.println("Not Weird");
        else if (number >= 6 & number <= 20)
            System.out.println("Weird");
        else
            System.out.println("Not Weird");

    }

}

