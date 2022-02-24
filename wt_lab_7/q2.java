class A 
{
     void show() 
    {
        System.out.println("This is A class");
    }
}

final class B extends A 
{
    void show()
    { 
        System.out.println("This is B class");
    }
}
class C extends B 
{
    void show()
    { 
        System.out.println("This is C class");
    }
}
class q2{
    public static void main(String[] args)
    {
        C ob = new C();
        ob.show();
    }
}