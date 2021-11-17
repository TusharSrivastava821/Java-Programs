// Write a program to print the sum of the elements of an array following the given below condition:-
// If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

import java.util.Scanner;
public class ArraySum
{
    int[] arr;
    int size;
    Scanner sc = new Scanner(System.in);
    ArraySum()
    {
        System.out.print("Size of Array : ");
        size = sc.nextInt();
        arr = new int[size];
    }
    public void setArr()
    {
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public void calcSum()
    {
        int f1 = 0, f2 = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]==6)
                f1 = i;
            else if(arr[i] == 7)
                f2 = i;
        }
        if (f1 < f2)
        {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < f1; i++)
            {
                sum1 += arr[i];
            }
            for (int i = f2+1; i < arr.length ; i++)
            {
                sum2 += arr[i];
            }
            System.out.println("SUM : " + (sum1+sum2));
        }
        else if(f1 > f2)
        {
            int sum = 0;
            for (int i = 0; i < arr.length; i++)
            {
                sum += arr[i];
            }
            System.out.println("SUM : " + sum);
        }
    }
}
class SumMain
{
    public static void main(String[] args)
    {
        ArraySum obj = new ArraySum();
        obj.setArr();
        obj.calcSum();
    }
}