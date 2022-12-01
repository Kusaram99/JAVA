package oopsConcept;

public class HybridInheritance {
    public static void main(String[] args){
        // Shark 
        // Shark shark = new Shark();
        // shark.color = "Dark Blue";
        // shark.eat();
        // shark.swim();
        // shark.danger = "Danger";
        // shark.danger();
        // System.out.println(shark.color);
        // System.out.println("-----------------------");
        // Dollphin
        Dollphin doll = new Dollphin();
        doll.color = "Blue and White";
        doll.eat();
        doll.swim();
        doll.danger = "Intelligent";
        doll.danger();
        System.out.println(doll.color);
    }
}

// base class
class Animals {
    String color;
    void eat(){
        System.out.println("Eat..");
    }
    void breath(){
        System.out.println("Breath..");
    }
}

class Fish extends Animals{
    String danger;
    void swim(){
        System.out.println("swim");
    }
    void danger(){
        System.out.println("danger: "+danger);
    }
}

class Shark extends Fish{
    void live(){
        System.out.println("Sea");
    }
}

class Dollphin extends Fish{
    void live(){
        System.out.println("Sea and normal water pool");
    }
}
