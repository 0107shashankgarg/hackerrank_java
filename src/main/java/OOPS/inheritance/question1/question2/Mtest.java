package OOPS.inheritance.question1.question2;

public class Mtest {

    public static void main(String[] args) {

        int i = 10;
        float f = 10.9f;

        String[] str = new String[6];
        System.out.println(str);

        MyString[] a = {new MyString("a"), new MyString("b")};
        System.out.println(a);
        System.out.println(a[0]);

        System.out.println("y" + new StringBuilder("test"));
        System.out.println("t" + new MyString("test"));
    }

}
