package OCP.callingHireacy;

public class Employee extends Person {
    static {
        System.out.println("Employee: First Static Block");
    }

    static {
        System.out.println("Employee: Second Static Block");
    }

    {
        System.out.println("Employee: First Instance Initialization Block");
    }

    {
        System.out.println("Employee: Second Instance Initialization Block");
    }

    public Employee() {
        System.out.println("Employee()");
    }
}