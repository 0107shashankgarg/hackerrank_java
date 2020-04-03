/*

import java.util.*;


public class Hour_glass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();
    }

    public void hourGlass(int[][] arr) {
int sum =0;

        for (int i = 0; i < i+3 ; i++) {

            for (int j = 0; j < 3; i++)
            {
                if(j==1)
                sum= sum+ arr[i][];
       sum = sum + arr[i][j];
            }
        }

    }
}*/
