public class multilevel{
    public static void main(String args[]){
        Dog dobby=new Dog();
        dobby.eat();
        dobby.sleep();
        dobby.legs=4;
        System.out.println(dobby.legs);

    }
}
class Animal{
    void eat(){
        System.out.println("eating");
    }
    void sleep(){
        System.out.println("sleeping");
    }
}
class Mammal extends Animal{
    int legs;

    
}
class Dog extends Mammal{
    String breed;
}