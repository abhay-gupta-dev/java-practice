public class OOP2{
    public static void main(String args[]){
        Dog d=new Dog();
        d.sound();
        Cat c=new Cat();
        c.sound();

    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }

}
class Dog extends Animal{
   // @override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    //@override
    void sound(){
        System.out.println("Cat meows");
    }
}