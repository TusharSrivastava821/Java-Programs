// A program to demonstrate custom exceptions.

package myname.student;
public class Student 
{
    private String name;
    private int rollNo;
    private double Cpi;

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public int getRollNo() 
    {
        return rollNo;
    }

    public void setRollNo(int rollNo) 
    {
        this.rollNo = rollNo;
    }

    public double getCpi() 
    {
        return Cpi;
    }

    public void setCpi(double cpi) 
    {
        Cpi = cpi;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", Cpi=" + Cpi +
                '}';
    }
}