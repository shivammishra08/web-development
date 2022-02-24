import java.util.*;
public class q8 {
    int n;
    double d;
    char ch;
    String s;
    q8(int num, double dbl, char c, String str){
        n = num;
        System.out.println("n initialised : "+n);
        d = dbl;
        System.out.println("d initialised : "+d);
        ch = c;
        System.out.println("ch initialised : "+ch);
        s = str;
        System.out.println("s initialised : "+s);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int num = sc.nextInt();
        System.out.print("Enter a double : ");
        double dbl = sc.nextDouble();
        System.out.print("Enter a char : ");
        char c = sc.next().charAt(0);
        System.out.print("Enter a String : ");
        String s = sc.next();
	    q8 ob = new q8(num, dbl, c, s);
    }
}