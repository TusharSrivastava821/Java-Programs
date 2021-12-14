// . Write a program to check whether the given no is a valid mobile number or not? 
// The mobile no is entered by the command line argument .

package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Enter Mobile no. : ");
        str = sc.nextLine();
        Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
        Matcher m = p.matcher(str);

        int ctr = 0;
        while (m.find())
        {
            System.out.println(m.group());
            ctr++;
        }
    }
}