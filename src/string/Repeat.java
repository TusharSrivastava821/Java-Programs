// Given a string, return a new string made of n copies of the first 2 chars of the original string where n is the length of the string. 
// The string may be any length. If there are fewer than 2 chars, use whatever is there.
// If the input is “Apple” then the output should be “ApApApApAp”.

package string;
import java.util.Scanner;
public class Repeat
{
    String str, fArr[];
    int len;
    Scanner sc = new Scanner(System.in);
    Repeat()
    {
        System.out.print("String : ");
        str = sc.nextLine();
        len = str.length();
        fArr = str.split("");
    }
    public void repeatFirst()
    {
        for (int i = 0; i < len; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.print(fArr[j]);
            }
        }
    }
}
class RepeatFirstMain
{
    public static void main(String[] args)
    {
        Repeat obj = new Repeat();
        obj.repeatFirst();
    }
}
