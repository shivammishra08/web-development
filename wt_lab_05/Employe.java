import java.util.*;
class Details{
    int id;
    String name;
    String deptt;
    double salary;
    public void get(int id,String name,String deptt,double salary) {
        this.id=id;
        this.name=name;
        this.deptt=deptt;
        this.salary=salary;        
    }
    public void show() {
        System.out.println("Name: "+name+"\nID: "+id+"\nDept: "+deptt+"\nSalary: "+salary);
    }
}

public class Employe {
    public static void main(String[] args) {
        int id;
        String name;
        String deptt;
        double salary;
        Details d=new Details();
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the details");
            id=sc.nextInt();
            name=sc.next();
            deptt=sc.next();
            salary=sc.nextDouble();
        
        d.get(id, name, deptt, salary);
        d.show();
    }
}