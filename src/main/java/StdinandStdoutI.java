import java.util.ArrayList;
import java.util.Scanner;

public class StdinandStdoutI {

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<Integer>();

        for (int i = 0 ; i < 3; i++)
        {
            input.add(in.nextInt());
        }
           if(input.size() == 3) {
               System.out.println(input.get(0));
               System.out.println(input.get(1));
               System.out.println(input.get(2));
           }

    }
}
