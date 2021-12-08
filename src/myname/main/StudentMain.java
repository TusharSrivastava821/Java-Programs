package myname.main;
import myname.exception.InvalidStudentException;
import myname.student.Student;
import java.util.Scanner;

public class StudentMain 
{
    public static void main(String[] args) throws InvalidStudentException 
    {
        Student[] list = new Student[2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = new Student();
            list[i].setName(sc.nextLine());
            list[i].setRollNo(sc.nextInt());
            list[i].setCpi(sc.nextDouble());
            sc.nextLine();
        }
        StudentMain obj = new StudentMain();
        try 
        {
            Student result = obj.search(list, 12);
            System.out.println(result);
        }
        catch (InvalidStudentException e)
        {
            System.out.println(e.getMessage());

        }
    }
    public Student search(Student[] list, int rollNo) throws InvalidStudentException
    {
        Student response = null;
        for (Student student : list) 
        {
            if(student.getRollNo() == rollNo)
            {
                response = student;
                break;
            }
        }
        if(response == null)
        {
            InvalidStudentException e = new InvalidStudentException("Student not found");
            throw e;
        }
        return response;
    }
}