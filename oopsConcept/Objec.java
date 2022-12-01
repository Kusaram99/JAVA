package oopsConcept;

public class Objec {
    public static void main(String[] args){
        System.out.println("hello");
        Pen p1 = new Pen();
        // public
        // p1.getColor("Red");
        // p1.color = "Blue";
        // System.out.println(p1.color);

        // private 
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(3);
        System.out.println(p1.getTip());

    }
}

class Pen{
    private String color;
    private int tip;
    void setColor (String color){
        this.color = color;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
    int getTip(){
        return tip;
    }

}
