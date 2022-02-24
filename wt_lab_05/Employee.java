import java.util.Scanner;
public class Employee {
    int age_1028;
    String name_1028,depname_1028;
    float salary_1028;
    public void getInput() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age : ");
        age_1028 = in.nextInt();
        System.out.print("Enter the name : ");
        name_1028 = in.next();
        System.out.print("Enter the department name : ");
        depname_1028 = in.next();
        System.out.print("Enter the salary : ");
        salary_1028 = in.nextFloat();
    }
    
    public void display() {
        System.out.println("Employee age = " + age_1028);
        System.out.println("Employee name = " + name_1028);
        System.out.println("Employee salary = " + salary_1028);
        System.out.println("Employee department name = " + depname_1028);
    }

    public static void main(String[] args) {
        Employee e_1028[] = new Employee[3];
        for(int i=0; i<3; i++) {
            System.out.println("Employee "+ (i+1));
            e_1028[i] = new Employee();
            e_1028[i].getInput();
        }
        System.out.println("--------- Data Entered as below --------------");
        for(int i=0; i<3; i++)
            e_1028[i].display();
    }
}