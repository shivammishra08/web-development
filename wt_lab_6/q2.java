import java.util.*;
class Input{
    static Scanner sc = new Scanner(System.in);
}
class Plate{
    float length, width;
    Plate(){
        System.out.print("\nEnter length : ");
        length = Input.sc.nextFloat();
        System.out.print("Enter width : ");
        width = Input.sc.nextFloat();
    }
    void display(){
        System.out.println("\nLength : "+length);
        System.out.println("Width : "+width);
    }
}
class Box extends Plate{
    float height;
    Box(){
        System.out.print("Enter height : ");
        height = Input.sc.nextFloat();
    }
    void display(){
        super.display();
        System.out.println("Height : "+height);
    }
}
class W_Box extends Box{
    float thickness;
    W_Box(){
        System.out.print("Enter thickness : ");
        thickness = Input.sc.nextFloat();
    }
    void display(){
        super.display();
        System.out.println("Thickness : "+thickness);
    }
}
public class q2 {
    public static void main(String[] args) {
        W_Box ob=new W_Box();
        ob.display();
	}
}