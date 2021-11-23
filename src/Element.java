// Create an int array of size 5, initialize it with values(10,20,30,40,50).
// Create a public boolean search(int arr[], int search_element) this method will 
// return true if the search element is present in the array else it will  print a message "element not found".
import java.util.Scanner;
public class Element 
{
    public static boolean search(int arr[],int search_element)
    {
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search_element)
            {
                a++;
            }
        }
        if(a>0)
        return true;
        else
        return false;
    }
    public static void main(String[] args) 
    {
      int a[]= {10,20,30,40,50};
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the element to be search: ");
      int n=sc.nextInt();
      boolean d=search(a,n);
      if(d==true)
      System.out.println("True");
      else
      System.out.println("element not found");
    }
}