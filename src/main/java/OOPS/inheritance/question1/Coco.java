package OOPS.inheritance.question1;

class Coco extends Bird {
    public static void main(String[] args) {
        Bird a = new Coco();
        a.walk();

        Bird b = new Bird();
        ((Animal) b).walk();
    }

    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");

    }

    void walk() {
        System.out.println("I coco");
    }

/*
    Bird()
    {
        super("ob");
        System.out.println("bire");
    }

    Bird(String an)
    {
        super("ob");
        System.out.println(an);
    }
*/


}