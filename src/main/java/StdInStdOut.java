import java.util.ArrayList;
import java.util.Scanner;

public class StdInStdOut {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();

        while(in.hasNext())
        {
            input.add(in.nextLine());
        }
           if(input.size() == 3) {
               System.out.println("String: " + input.get(2));
               System.out.println("Double: " + Double.parseDouble(input.get(1)));
               System.out.println("Int: " + Integer.parseInt(input.get(0)));
           }

    }
}
