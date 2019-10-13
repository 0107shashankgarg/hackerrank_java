
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Datatype {

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            try
            {
                long a =sc.nextLong();
                System.out.println(a+" can be fitted in:");
                if(a>= Byte.MIN_VALUE && a<=Byte.MAX_VALUE)
                    System.out.println("* byte");
                if(a>= Short.MIN_VALUE && a<=Short.MAX_VALUE)
                    System.out.println("* short");
                if(a>= Integer.MIN_VALUE && a<=Integer.MAX_VALUE)
                    System.out.println("* int");
                if(a>= Long.MIN_VALUE && a<=Long.MAX_VALUE)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }


    }

}