class a
{
a()
{
System.out.println("a's constructor"); 
}
}
class b extends a 
{ 
b() 
{ 
System.out.println("b's constructor"); 
} 
}
class c extends b 
{
c()
{ 
System.out.println("c's constructor"); 
} 
} 
class Check 
{
public static void main(String arg[])
{ 
c ob=new c(); 
}
}
