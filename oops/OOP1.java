import java.util.Arrays;
public class OOP1{
    public static void main(String[] args){
        int marks[]={85,90,95};
        Student s1=new Student("Alice",marks);
        System.out.println(s1.name);
        System.out.println(Arrays.toString(s1.marks));
        //lazy copy
        Student s2=new Student(s1);
     System.out.println("Before modification:");
        s1.display();
        s2.display();
         // Modify s2
        s2.setMarks(0, 100);

        System.out.println("After modification:");
        s1.display();
        s2.display();



    }
}
class Student{
    String name;
    int marks[];

    Student(String name,int marks[]){
        this.name=name;
        this.marks=marks;

    }
    Student(Student s1){
        this.name=s1.name;
        this.marks=s1.marks;
    }
    void setMarks(int index,int value){
        int [] newmarks=new int[marks.length];
        //copying elements of s1 marks to s2
        for(int i=0;i<marks.length;i++){
            newmarks[i]=marks[i];
        }
        this.marks=newmarks;
        this.marks[index]=value;
    }
    void display(){
        for(int mark:marks){
            System.out.print(mark+" ");
        }
        System.out.println();
    }
}