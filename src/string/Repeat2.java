// Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
// You may assume that n is between 0 and the length of the string, inclusive.
// For example, if the inputs are “Niraj” and 3, then the output should be “rajrajraj.

package string;
import java.util.Scanner;
public class Repeat2
{
    String str, arr[];
    int n;
    Scanner sc = new Scanner(System.in);
    Repeat2()
    {
        System.out.print("String : ");
        str = sc.nextLine();
        System.out.print("Number of repeating characters : ");
        n = sc.nextInt();
    }
    public void repeat()
    {

        arr = str.split("");
        for (int i = 0; i < n; i++)
        {
            for (int j = arr.length - n; j < arr.length; j++)
            {
                System.out.print(arr[j]);
            }
        }
    }
}
class RepeatMain
{
    public static void main(String[] args)
    {
        Repeat2 obj = new Repeat2();
        obj.repeat();
    }
}