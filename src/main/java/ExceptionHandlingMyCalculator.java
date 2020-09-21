import java.util.Scanner;

class ExceptionHandlingMyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 | p < 0)
            throw new Exception("n or p should not be negative.");
        if (n == 0 | p == 0)
            throw new Exception("n and p should not be zero.");
        return (long) Math.pow(n, p);
    }
    /*
     * Create the method long power(int, int) here.
     */

}

class Solution1 {
    public static final ExceptionHandlingMyCalculator my_calculator = new ExceptionHandlingMyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}