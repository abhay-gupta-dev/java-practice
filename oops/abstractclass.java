public class abstractclass{
    public static void main(String[] args){
        Horse h=new Horse();
        h.eat();
        h.walk();
        h.changecolor();
        System.out.println(h.color);

    }
}
abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats food.");
    }
    abstract void walk();


}
class Horse extends Animal{
    void walk(){
        System.out.println("horse walks on 4 legs");
    }
    void changecolor(){
        color="red";

    }
}