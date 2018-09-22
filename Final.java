/**
 * Final
 * This example illustrates the final datatype in Java
 */
public class Final {
    // This is a blank variable that isn't initialized from the onset.
    final public int age;
    // We have a constructor here.
    Final(int x) { this.age = x; }
    Final() {
        // Default value. This is rendered, if no age is passed when the instance is called.
        this(15);
    }
    public static void main(String[] args) {
        // This will render the default age set.
        Final age1 = new Final();
        System.out.println(age1.age);
        // Age is passed into the constructor, hereby rendering 10.
        // However, age2 cannot be changed e.g age2.age = 20 results to error.
        Final age2 = new Final(10);
        System.out.println(age2.age);

    }
}