
import java.util.Scanner;

public class JavaRegexIp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    static final String pattern
            = "/(\\b\\w+\\b)\\W+\\1/";
}

