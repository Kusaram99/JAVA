package oopsConcept;

public class Inheritance {
    
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.color = "Black";
        dog.leg = 4;
        dog.eat();
        dog.legs();
        System.out.println(dog.color);
        Dog dog2 = new Dog();
        dog2.color = "White";
        dog2.leg = 2;
        dog2.eat();
        dog2.legs();
        System.out.println(dog2.color);

    }
}

// base class;
class Animals {
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breathes(){
        System.out.println("Breathes...");
    }
}

// Derived class              => Mammals > dog, lion, goat, monkey
class Mummals extends Animals{
    int leg;
    void legs(){
        System.out.println("Leg: "+leg);
    }
}

class Dog extends Mummals{
    void run(){
        System.out.println("Yes It can run");
    }
}














// --------------------- Single Inheritance -----------------
// // Base Class
// class Animals {
//     String color;
//     void eat(){
//         System.out.println("Eat...");
//     }
//     void breath(){
//         System.out.println("Breathing...");
//     }
// }

// // Derived Class
// class Fish extends Animals{
//     String fing;
//     void switm(){
//         System.out.println("Swiming....");
//     }
// }
