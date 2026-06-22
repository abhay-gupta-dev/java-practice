// public class interfaces{
//     public static void main(String[] args){
//        vehicle v1=new Car();
//        vehicle v2=new Bike();
//        v1.start();
//        v1.stop();
//        System.out.println();
//        v2.start();
//        v2.stop();

//     }
// }
// interface vehicle{
//     void start();
//     void stop();
// }
// class Car implements vehicle{
//      public void start() {
//         System.out.println("Car starts with key.");
//     }

//     public void stop() {
//         System.out.println("Car stops.");
//     }
// }
// class Bike implements vehicle{
//     public void start(){
//         System.out.println("bike start with self-start");
//     }
//     public void stop(){
//         System.out.println("bike stops");
//     }
// }


// public class interfaces{
//     public static void main(String[] args){
//         Payment payment=new upiPayment();
//         payment.pay(500000);

//         payment=new creditcardPayment();
//          payment.pay(2000);



//     }
// }
// interface Payment{
//     void pay(double amount);
// }
// class upiPayment implements Payment{
//     public void pay(double amount){
//         System.out.println("Paid ₹" + amount + " via UPI");
//     }
    
// }
// class creditcardPayment implements Payment{
//     public void pay(double amount){
//                 System.out.println("Paid ₹" + amount + " via Credit Card");

//     }

// }

class Student {

    String name;                          // non-static (object level)
    static String college = "ABC College"; // static (class level)

    // constructor
    Student(String name) {
        this.name = name;
    }

    // non-static method (needs object)
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }

    // static method (belongs to class)
    static void changeCollege() {
        college = "XYZ University";
    }
    static void setcollege(String newcollege){
        college=newcollege;
    }
    static String getcollege(){
        return college;
    }

    // static method
    static void showCollege() {
        System.out.println("College: " + college);
    }
}

public class interfaces {
    public static void main(String[] args) {

        Student s1 = new Student("Abhay");
        Student s2 = new Student("Rahul");

        // before change
        s1.displayDetails();
        s2.displayDetails();

        System.out.println("\n--- Changing College ---\n");

        // static method call using class name
        Student.setcollege("lnct");
        Student.changeCollege();

        // after change
        s1.displayDetails();
        s2.displayDetails();

        System.out.println("\n--- Static Method ---");
        Student.showCollege();
    }
}