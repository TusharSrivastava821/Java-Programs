package library;
import java.util.Scanner;
interface LibraryUser
{
    public void registerAccount(int age);
    public void requestBook(String BookName);
}
class KidUsers implements LibraryUser
{
    int age;
    String bookType;
    public void registerAccount(int age)
    {
        if(age<12)
        {
            System.out.println("You have successfully registerted as a Kid");
        }
        else{
            System.out.println("Sorry, Age miust be less than 12 to register as Kid");}
        }
        @Override
         public void requestBook(String BookName)
        {
            if(BookName.equals("Kids"))
            {
                System.out.println("Book issued successfully ,please return within 10 days");   
            }
            else
            {
                System.out.println("Oops, you are allowed to take only Kids Book");
            }    
        }   
    }
class AdultUser implements LibraryUser
{
  int age;
  String bookType;
  public void registerAccount(int age)
  {
      if(age>12)
      {
        System.out.println("You have successfully registered under an adult account");
      }
      else
      {
        System.out.println("Sorry,Age must be greater than 12 to register as Adult");
      }
    }
    @Override
    public void requestBook(String BookName)
    {
    if (BookName.equals("Fiction"))
    {
        System.out.println("Book issued successfully, please return within 7 days");
    }
    else
    {
        System.out.println("Oops, you are allowed to take only adult fiction books");
    }
   }
}
class LibraryInterfaceDemo
{
    public static void main(String[] args) 
    {
        Scanner h = new Scanner("System.in");
            // Test Case 1
            KidUsers obj1=new KidUsers();
            System.out.println("Enter your Age");
            int a=h.nextInt();
            obj1.registerAccount(a);
            System.out.println("Enter type of Book");
            String b=h.nextLine();
            obj1.requestBook(b);
            // Test Case 2
            AdultUser obj2=new AdultUser();
            System.out.println("Enter your age");
            int c=h.nextInt();
            obj2.registerAccount(c);
            System.out.println("Enter type of Book");
            String d=h.nextLine();
            obj2.requestBook(d);
    }
}



