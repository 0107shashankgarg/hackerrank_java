
import java.util.Scanner;

public class Substringcom {

    public static String getSmallestAndLargest(String s, int k) {

        if (s.length() >= 1 & s.length() <= 1000) {
            String small = s.substring(0, k);
            String large = s.substring(0, k);

            while (s.length() > k - 1) {
                if ((s.substring(0, k).compareTo(large)) > 0)
                    large = s.substring(0, k);
                if ((s.substring(0, k).compareTo(small)) < 0)
                    small = s.substring(0, k);
                s = s.substring(1);
            }

            return small + "\n" + large;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();



    }
}
