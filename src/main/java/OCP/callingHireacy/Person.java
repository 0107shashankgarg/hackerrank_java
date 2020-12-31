package OCP.callingHireacy;

public class Person {

    static {
        System.out.println("Person: First Static Block");
    }

    static {
        System.out.println("Person: Second Static Block");
    }

    {
        System.out.println("Person: First Instance Initialization Block");
    }

    {
        System.out.println("Person: Second Instance Initialization Block");
    }

    public Person() {
        System.out.println("Person()");
    }

    public void sayHello() {
        System.out.println("Person: Hello!");
    }
}