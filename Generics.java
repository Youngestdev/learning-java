/**
 * Generics
 * Java and it's tough rules sha ah.
 * Well, learnt about Generics.. A nice one sha.
 */

// Generic class, Abdul which can take any datatype, A. the <> consent to that.
class Abdul< A extends B & C > {
    // A constructor is declared so I can set a value.
    private A objRef;
    public Abdul(A prop) { this.objRef = prop; }
    // getProperty() method defined to retrieve the value of @{code} prop
    public void getProperty() { this.objRef.displayClass(); }
}

class B implements C {
    public void displayClass() 
    { 
        System.out.println("Yayy ! It works.."); 
    } 
}

interface C 
{ 
    public void displayClass(); 
}

// Main class Generics
public class Generics {

    // Main render function.
    public static void main(String[] args) {
        // An instance of the generic class created.
        Abdul <B> name = new Abdul<B>(new B());
        // Print the value of the instance through the method getProperty()
        name.getProperty();
    }
}