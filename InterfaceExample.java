/**
 * InterfaceExample
 */
public interface InterfaceExample {
    // My age won't finalize at 15 oh.. Lol, joking.
    final int age = 15;
    void displayAge();

}

/**
 * InnerInterfaceExample
 * This is implementing the interface I created.
 */
class InnerInterfaceExample implements InterfaceExample {

    public void displayAge() {
        System.out.println(age);   
    }

    public static void main(String[] args) {
        InnerInterfaceExample abdul = new InnerInterfaceExample();
        abdul.displayAge();
    }

}