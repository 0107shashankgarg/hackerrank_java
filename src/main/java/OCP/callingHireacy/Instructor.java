package OCP.callingHireacy;

public class Instructor extends Employee {

    public static String str1 = "Explicit Initialization String";

    {
        System.out.println("Instructor: First Static Block");
        str1 = "First Static Initialization String";
    }

}