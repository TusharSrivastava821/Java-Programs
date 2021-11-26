public class MethodHiding
{
    public static void demoMethod() 
    {
       System.out.println("Method of Super Class");
    }
 }
    class Concept extends MethodHiding 
 {
    public static void demoMethod() 
    {
       System.out.println("Method of Sub Class");
    }
    public static void main(String args[] ) 
    {
       Concept.demoMethod();
    }
 }
 