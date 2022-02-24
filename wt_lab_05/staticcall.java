import java.util.*;
public class staticcall {
    static int m_1028;
    static{
        m_1028=0;
    }
    staticcall(){
        m_1028++;
    }
	public static void main(String[] args) {
	    staticcall ob1 = new staticcall();
	    staticcall ob2 = new staticcall();
        staticcall ob3 = new staticcall();
	    System.out.println("Number of objects created = "+m_1028);
	}
}