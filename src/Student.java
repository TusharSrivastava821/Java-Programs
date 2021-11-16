import java.util.Scanner;
public class Student
{
    float Percentage;
    String Name;
    Student()
    {
        Name = "Unknown";
    }
    Student(String Name)
    {
        this.Name = Name;
    }
    Student(String Name, float Percentage)
    {
        this.Name = Name;
        this.Percentage = Percentage;
    }
}
class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student 1st : ");
        Student s1 = new Student(sc.next(), sc.nextFloat());
        System.out.println("Student 2nd : ");
        Student s2 = new Student(sc.next(), sc.nextFloat());
        System.out.println("Student 3rd : ");
        Student s3 = new Student(sc.next(), sc.nextFloat());
        System.out.println("Enter Student Name : ");
        Student s4 = new Student("Ram");
        Student s5 = new Student();
        if (s1.Percentage > s2.Percentage) {
            Compare(s1, s3);
        } else {
            Compare(s2, s3);
        }
        sc.close();
        System.out.println(s4.Name);
        System.out.println(s5.Name);
    }

    private static void Compare(Student s2, Student s3) {
        if (s2.Percentage > s3.Percentage) {
            System.out.println("Name : " + s2.Name);
            System.out.println("Percentage : " + s2.Percentage);
        } else {
            System.out.println("Name : " + s3.Name);
            System.out.println("Percentage : " + s3.Percentage);
        }
    }

}