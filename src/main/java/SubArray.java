import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.nextLine();
        scan.close();
        System.out.println(s);
        int ctr = 0;
        String[] a;


        a = s.split(" ");
        for (int i = 0; i < a.length - 1; i++) {
            int sum = 0;
            int j = i;
            while (j <= 5) {
                sum = sum + Integer.parseInt(a[j]);
                j++;
                System.out.println(sum);
            }
            if (sum < 0)
                ctr++;

        }

        System.out.println(ctr);
    }

}

