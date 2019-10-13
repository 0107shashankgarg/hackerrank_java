import java.util.Scanner;

public class EndOfFile {

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String fileLine;
        int ctr = 1;

        while (in.hasNextLine())
        {
            fileLine = in.nextLine();
            System.out.println(ctr + " " + fileLine);
            ctr++;
        }
    }
}