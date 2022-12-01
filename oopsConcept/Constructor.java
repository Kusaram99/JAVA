package oopsConcept;

public class Constructor {
    public static void main(String[] args){
        Hourse h = new Hourse();
    }
}

class Animals {
    Animals(){
        System.out.println("Animals.....");
    }
}

class Hourse extends Animals{
    Hourse(){
        // super();
        System.out.println("Hourse......");
    }
}
