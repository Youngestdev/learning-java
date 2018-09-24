class WhileLoop {
    public static void main(String[] args) {
        int x = 0;
        while (x <= 5) {
            System.out.println(x);
            x++;
        }   
    }
}

class ForLoop {
    public static void main(String[] args) {
        for (int y = 2;  y <= 10; y++) {
            System.out.println(y);
        }
    }
}


class enhancedForLoop {
    public static void main(String[] args) {
        String family[] = {"Abdul", "Ameedat", "Aminat"};
        for (String z:family) {
            System.out.println(z);
        }
    }
}


// Java program to illustrate do-while loop 
class dowhileloopDemo 
{ 
    public static void main(String args[]) 
    { 
        int x = 21; 
        do
        { 
            // The line will be printed even 
            // if the condition is false 
            System.out.println("Value of x:" + x); 
            x++; 
        } 
        while (x < 20); 
    } 
} 