package OCP.food;


import java.util.ArrayList;


public class Apple1 extends Apple {


    Apple1() {
        System.out.println("apple1");
    }


    Apple1(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {

        //    Arrays.b
        StringBuilder lol = new StringBuilder();
        System.out.println(lol.append("lol"));
        System.out.println(lol + " ");

        //  System.out.println(LocalTime.now() == LocalTime.now());
        Apple1 app = new Apple1();
        app.test();
        /*float aww = new Float("3.4");*/
        StringBuilder aa = new StringBuilder("yty");
        int a = 10;
        String a2 = "a";
        double b = 0.0;
        if (true)
            System.out.println("true");
        ArrayList<Apple> my = new ArrayList<>();
        my.add(new Apple1());
    }

    public int test() {
        return 1;
    }


}
