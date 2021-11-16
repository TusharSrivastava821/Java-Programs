import java.util.Scanner;

public class Palindrome
{
    Scanner sc = new Scanner(System.in);
    int num, digit, rev, temp;
    Palindrome()
    {
        System.out.println("Enter Number : ");
        num = sc.nextInt();
        temp = num;
        rev = 0;
    }


    public void isPalindrome(int a)
    {
        while (temp > 0)
        {
            digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        if (num == rev)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " isn't a Palindrome");
    }
}
class NumPalMain
{
    public static void main(String[] args)
    {
        Palindrome obj = new Palindrome();
        obj.isPalindrome(obj.num);

    }
}