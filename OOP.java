public class OOP {
    public static void main(String[] args){
        // Pen p1=new Pen();
        // p1.setColor("blue");
        // p1.setTip(5);
        // System.out.println(p1.getColor());
        // System.out.println(p1.getTip());

        Student s1=new Student("Alice");
        System.out.println(s1.name);
        Student s2=new Student();
        s2.name="Bob";
        s2.age=20;
        s2.rollNo=101;
        s2.marks[0]=85;
        s2.marks[1]=90;
        s2.marks[2]=95;
        System.out.println(s2.name);
        Student s3=new Student(s2);
        s3.rollNo=102;
        System.out.println(s3.rollNo);
        System.out.println(s2.rollNo);
        // for(int i=0;i<s2.marks.length;i++){
        //     System.out.print(s2.marks[i]+ " ");
        // }
         for(int i=0;i<s3.marks.length;i++){
            System.out.println(s3.marks[i]);
        }
        s2.marks[0]=100;
        System.out.println(s3.marks[0]);
        System.out.println(s2.marks[0]);
        s3.marks[2]=89;
        System.out.println(s2.marks[2]);
        System.out.println(s3.marks[2]);





    }
    
}
class Pen{
   private String color;
    private int tip;
    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        this.color=newColor;
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int newTip){
        this.tip=newTip;
    }
}

class Student{
    String name;
    int age;
    int rollNo;
    int marks[];

    Student(){
        marks=new int[3];
        System.out.println("Constructor is called...");

    }
    Student(Student s2){
        // this.marks=new int[s2.marks.length];
        this.marks=s2.marks;
        this.name=s2.name;
        this.age=s2.age;
        this.rollNo=s2.rollNo;

        // for(int i=0;i<s2.marks.length;i++){
        //     this.marks[i]=s2.marks[i];
        // }
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
       
    }
}

