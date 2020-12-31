package OCP.food;

public class test {


    public static void main(String[] ad) {
        String $ = "";

        String[] a = new String[]{"-", "A", "."};
        for (int x = 0; x++ < a.length; ) {
            System.out.println(x);
            //  $+= a[x];
            System.out.println(x);

        }
        System.out.println($);


        for (int x = 0; x < a.length; ++x) {
            System.out.println(x);
            $ += a[x];
            System.out.println(x);

        }
        System.out.println($);

        for (int i = 0; i < 10; i++) {

            continue;

        }
    }


}
