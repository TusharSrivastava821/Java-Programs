// Create an outer class with a function display,
// again create another class inside the outer class named inner with a function called display and call the two functions in the main class. 

public class Outer
{
    public void display()
    {
        System.out.println("In outer class.");
    }
    public void m1()
    {
        class Inner
        {
            public void display()
            {
                System.out.println("Inside inner class");
            }
        }
        Inner obj1 = new Inner();
        obj1.display();
    }
}
class Test1
{
    public static void main(String[] args)
    {
        Outer obj = new Outer();
        obj.display();
        obj.m1();
    }
}