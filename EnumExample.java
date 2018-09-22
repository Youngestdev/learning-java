/**
 * EnumExample
 * Second lesson
 * also learnt about data type - int, byte, char, String etc
 */

 enum Family {
     FATHER, MOTHER, CHILDREN
 }

public class EnumExample {

    public static void main(String[] args) {
        Family test = Family.FATHER;
        int age = 50;
        System.out.println(test);
        System.out.println(age);
        Family[] trees = Family.values();
        // Looping through the enum Family.
        for (Family tree : trees) {
            System.out.println(tree);
        }
    }
}