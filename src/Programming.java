// . Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it, then the message "I love programming languages" should be printed.
// If some String is passed to it, then in place of "programming languages" the name of that String variable should be printed.
// For example, while creating object if we pass "Java", then "I love Java" should be printed.

public class Programming {
    public String message;
    Programming()
    {
         message = "programming languages";
    }
    Programming(String message)
    {
        this.message=message;
    }
    void display()
    {
        System.out.println("I love "+message);
    }
    public static void main(String args[])
    {
        Programming ob =new Programming("Java");
        Programming ob1 =new Programming();
        ob.display();
        ob1.display();
    }
}