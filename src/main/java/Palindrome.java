import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int flag = 0;
        int len = A.length() - 1;
        for (int i = 0; i < len / 2; i++) {
            if (A.charAt(i) != A.charAt(len - i))
                flag = 1;

        }
        if (flag == 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}