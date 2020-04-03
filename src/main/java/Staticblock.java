import java.util.Scanner;

public class Staticblock {

    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt(); // we know it's a `string`
        H = in.nextInt(); // it's an integer
        if (B > 0 & H > 0)
            flag = true;
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");

    }


    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class

