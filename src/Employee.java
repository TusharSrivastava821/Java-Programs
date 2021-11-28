import java.util.Scanner;
public class Employee
{
Scanner sc = new Scanner(System.in);
public int Eid;
public int ESal;
public String EName;
public String CName;
Employee ()
{
System.out.println("Name : ");
EName = sc.nextLine();
System.out.println("Company Name : ");
CName = sc.nextLine();
System.out.println("Employee ID : ");
Eid = sc.nextInt();
System.out.println("Employee Salary: ");
ESal = sc.nextInt();
}
}
class EmployeeMain
{
public static void  main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Number of Objects :");
int n = sc.nextInt();
Employee arr[] = new Employee [n];
for(int i = 0; i < n; i++)
{
arr[i] = new Employee();
}
}
}