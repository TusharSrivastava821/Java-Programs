// Given two strings, append them together (known as "concatenation") and return the result. 
// However, if the concatenation creates a double-char, then omit one of the chars. 
// If the inputs are “Mark” and “Kate” then the output should be “markate”. (The output should be in lowercase).

package String;
import java.util.Scanner;

public class Concatenation
{
    String str1, str2, str3;
    String [] arr;
    int count,flag;
    Scanner sc = new Scanner(System.in);
    Concatenation()
    {
        count = 0;
        flag = 0;
        System.out.print("String 1 : ");
        str1 = sc.nextLine();
        System.out.print("String 2 : ");
        str2 = sc.nextLine();
        str3 = str1 + str2;
        str3 = str3.toLowerCase();
        arr = str3.split("");
    }
    public void omit()
    {
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i].equals(arr[i+1]))
            {
                for (int j = i; j <= arr.length-2; j++)
                {
                    arr[j] = arr[j+1];
                }
                count++;
                flag = 1;
            }
        }
        if (flag == 0)
        {
            for (int i = 0; i < arr.length-count; i++)
            {
                System.out.print(arr[i]);
            }
        }
        else if (flag == 1)
        {
            for (int i = 0; i <= arr.length-count; i++)
            {
                System.out.print(arr[i]);
            }
        }
    }
}
class ConcatenationMain2
{
    public static void main(String[] args)
    {
        Concatenation obj = new Concatenation();
        obj.omit();
    }
}