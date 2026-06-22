package OOP_practice;

public class practice1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "rahul";

        System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;

}