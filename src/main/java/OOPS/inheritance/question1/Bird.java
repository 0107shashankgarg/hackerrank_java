package OOPS.inheritance.question1;

class Bird extends Animal {

    char c;
    void fly() {
        System.out.println("I am flying");
    }

    public static void main(String[] args) {
        Animal a = new Bird();
        a.walk();
        a.walk();
        ((Bird) a).sing();

        Bird b = new Bird();
        System.out.println(b.c);
        ((Animal) b).walk();
        int ajj = 10;


    }

    void sing() {
        System.out.println("I am singing");

    }

    void walk() {
        System.out.println("I bird");

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