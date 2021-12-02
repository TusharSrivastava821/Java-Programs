// Create a class named 'Member' having the following members:
// Data members:-
// 1 - Name
// 2 - Age
// 3 - Phone number
// 4 - Address
// 5 - Salary
// It also has a method named 'printSalary' which prints the salary of the members.
// Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. 
// Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same.

public class Member
{
    String name;
    int age;
    String number;
    String address;
    int salary;
    public void printSalary()
    {
        System.out.println(salary);
    }
}
class Employee extends Member
{
    String specialization;
}
class Manager extends Member
{
    String department;
}
class MemberMain
{
    public static void main(String[] args) 
    {
        Employee obj =new Employee();
        obj.name="Karan";
        obj.age=25;
        obj.number="12121212";
        obj.address="Kanpur";
        obj.salary=25000;
        obj.specialization="Frontend Developer";
        Manager obj1=new Manager();
        obj1.name="Aman";
        obj1.age=30;
        obj1.number="34343434";
        obj1.address="Agra";
        obj1.salary=50000;
        obj1.department="Information Technology";
    }
}
