package OCP.callingHireacy;

class Cinema {
    public String name;

    public Cinema() {
        super();
        System.out.println("def");
    }

    public Cinema(String name) {
        this.name = name;
    }

    private static void test() {

    }
}

public class Movie extends Cinema {
    public Movie(String movie) {
        super(movie);
    }

    public static void main(String[] showing) {

        Movie m = (Movie) new Cinema();
        System.out.println(m.name);


        System.out.print(new Movie("Another Trilogy").name);
    }
}