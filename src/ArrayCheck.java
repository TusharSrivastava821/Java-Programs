// Given an array of type int, print true if every element is 1 or 4. 

import java.util.Scanner;

public class ArrayCheck
{
    int[] arr;
    int size;
    Scanner sc = new Scanner(System.in);
    ArrayCheck()
    {
        System.out.println("Size of Array : ");
        size = sc.nextInt();
        arr = new int[size];
    }
    public void getArray()
    {
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public void search1and4()
    {
        int flag = 0;
        for (int j : arr) {
            if (j == 1 || j == 4)
                flag = 0;
            else {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
class Test
{
    public static void main(String[] args)
    {
        ArrayCheck obj = new ArrayCheck();
        obj.getArray();
        obj.search1and4();
    }
}