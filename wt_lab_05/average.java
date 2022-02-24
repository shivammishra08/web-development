import java.util.*;
public class average {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    class Student2{
            float avg_1028;
            Student2(){
                System.out.print("Enter Avg of student2 : ");
                this.avg_1028 = sc.nextFloat();
            }
        }
	    System.out.print("Enter Avg of student1 : ");
        float avg_1028 = sc.nextFloat();
		Student2 ob = new Student2();
		if(ob.avg_1028 > avg_1028)
		    System.out.println("Student 2 avg: "+ob.avg_1028);

		else
		    System.out.println("Student 1 avg: "+avg_1028);
	}
}