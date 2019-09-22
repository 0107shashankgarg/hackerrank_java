
import java.util.Scanner;

public class loop1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] argh) {

            int number = scanner.nextInt();
            if (number>=2 & number<=20)
            {
                for(int i =1; i<=10 ; i++)
                {
                    System.out.println( number + " x " + i + " = " + (number * i));
                }

            }

            else
                System.out.println("the numnber is not allowed");
    }
}