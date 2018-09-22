/**
 * VariablesExample
 * Here, I learnt about the variable types, how to initialize and declare
 * Also, learnt global and local variables.
 */
public class VariablesExample {
    // Global string, my name - Abdul.
    String name = "Abdul";
    // The myAge() method, a void function
    // returns my age
    public void MyAge() {
        // Locally declared integer, age set to 0
        int age = 0;
        // Age is set to 15
        age = age + 15;
        // Displays my age once this method is called.
        System.out.println("I'm" +age+ " years old");
    }

    // Main render function and/or block.
    public static void main(String[] args) {
        // An instance of @class VariablesExample is created
        VariablesExample Abdul = new VariablesExample();
        // The instance, invokes the method `myAge()`.
        Abdul.MyAge();
    }
}