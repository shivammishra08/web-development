import java.util.*;
class Input{
    static Scanner sc = new Scanner(System.in);
}
class Student{
    static int c = 0;
    String name;
    int roll, age;
    Student(){
        System.out.println("\nEnter details of Person "+(++c));
        System.out.print("Enter Name : ");
        name = Input.sc.next();
        System.out.print("Enter Roll : ");
        roll = Input.sc.nextInt();
        System.out.print("Enter Age : ");
        age = Input.sc.nextInt();
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Age : "+age);
    }
}
class Marks extends Student{
   
    float m1, m2, m3, avg;
    Marks(){
        super();
        System.out.print("Enter 3 marks : ");
        m1 = Input.sc.nextFloat();
        m2 = Input.sc.nextFloat();
        m3 = Input.sc.nextFloat();
        avg = (m1+m2+m3)/3;
    }
    void display(){
        super.display();
        System.out.println("Avg : "+avg);
    }
}
public class q3 {
    public static void main(String[] args) {
        Marks ob1 = new Marks();
        Marks ob2 = new Marks();
        if(ob1.avg > ob2.avg)
        {
            System.out.println("\nDetails of Person 1");
            ob1.display();
        }
        else
        {
            System.out.println("\nDetails of Person 2");
            ob2.display();
        }
    }
}