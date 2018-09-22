/**
 * InstanceVariable
 * This file, holds example of what i learnt - Instance variables...
 * It'll be about me basically.
 */
class Abdulazeez {
    String name;
    String hobby;
    int age;
}

public class InstanceVariable {
    public static void main(String[] args) {
        // Create an instance of the Abdulazeez class
        Abdulazeez adeshina = new Abdulazeez();
        // Pass the properties of the Abdulazeez class unto the Instance
        adeshina.name = "Abdulazeez Abdulazeez Adeshina";
        adeshina.age = 15;
        adeshina.hobby = "Coding, cooking, reading and eating";
        // Display the prop in a sentence form.
        System.out.println("My name is " +adeshina.name+ " and I'm " +adeshina.age+ "years old. My hobbies are " +adeshina.hobby);
    }
}