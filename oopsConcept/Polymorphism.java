package oopsConcept;



public class Polymorphism {
    public static void main(String[] args){
        // Method overloading-----
        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(2, 3));
        // System.out.println(cal.sum((float)1.5, (float) 2.5));
        // System.out.println(cal.sum(2,5,3));

        // Method overriding-----
        Dear dear = new Dear();
        dear.eat(); // Only the child will run
    }
}

// Run time polymorphism
class Animals {
    void eat(){
        System.out.println("eat anything...");
    }
}

class Dear extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}


// Compile time polymorphism
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}


