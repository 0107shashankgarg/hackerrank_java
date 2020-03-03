import java.util.Scanner;

public class stringtoken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        String[] a = s.trim().split("[ !,?._'@]+");
        if (s.isEmpty()) {
            System.out.print("0");
        } else if (s.length() > 400000) {
            System.out.print("0");
        } else {
            System.out.println(a
                    .length);
            for (String ele : a) {
                System.out.println(ele);
            }
        }


    }


}
