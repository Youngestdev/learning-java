/**
 * StaticVariable
 * Here, I learnt about Static variables...
 */

class AboutMe {
    public static String name = "Abdulazeez Abdulazeez Adeshina";
    public static int age = 15;
}

public class StaticVariable {

    public static void main(String[] args) {
        // I don't need to instantiate any object.
        System.out.println("I'm " +AboutMe.name+ " and I'm " +AboutMe.age+ " years old.");
    }
}