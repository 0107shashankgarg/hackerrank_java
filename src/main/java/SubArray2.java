import java.util.Scanner;

public class SubArray2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int _$_ = 0;
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {

            int num = scan.nextInt();
            a[i] = num;
        }

        System.out.println(a.length);
    }


}