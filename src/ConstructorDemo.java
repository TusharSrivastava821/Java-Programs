public class ConstructorDemo 
{
    int num1;  // instance variable
    int num2;  // instance variable
//  static int a;           //Static Variable
//    public void setvalue()
//    {
//        num1 = 89;
//        num2 = 90;
//    }
    ConstructorDemo()
    {

        num1 = 10;
        num2 = 20;
//      a = 77;
    }

    public void show()
    {
        System.out.println(num1);
        System.out.println(num2);
    }
}

class ConstructorDemoMain 
{
    public static void main(String[] args) 
    {
        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo();
        obj.show();
        obj1.show();
    }
}
