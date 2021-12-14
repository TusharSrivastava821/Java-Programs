// Write a program to check whether the given mail id is valid or not .

package regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String email;
        email = sc.nextLine();
        Pattern p = Pattern.compile("[a-z0-9._]+[@](gmail|yahoo|outllok)[.]com");
        Matcher m = p.matcher(email);

        int ctr = 0;
        while(m.find())
        {
            System.out.println(m.group());
            ctr++;
        }
    }
}
