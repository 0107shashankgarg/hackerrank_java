
import java.util.Scanner;

public class Substringcom {

    public static String getSmallestAndLargest(String s, int k) {

        String small = s.substring(0, k);
        String large = s.substring(0, k);

        while (s.length() > k - 1) {
            if ((s.substring(0, k).compareToIgnoreCase(large)) > 0)
                large = s.substring(0, k);
            if ((s.substring(0, k).compareToIgnoreCase(small)) < 0)
                small = s.substring(0, k);
            s = s.substring(1);
        }

        return small + "\n" + large;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));


    }
}
