// A HighSchool application has two classes: the Person superclass and the Student subclass. 
// Using inheritance, you will create two new classes, Teacher and CollegeStudent. 
// A Teacher will be like Person but will have additional properties such as salary (the amount the teacher earns) and subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”).
// The CollegeStudent class will extend the Student class by adding a year (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”).

package highSchool;

public class Person
{
    String gender;
    String bloodGroup;
}
class Student extends Person 
{
        String name;
        int age;
}

class Teacher extends Person
{
    int salary;
    String subject;
}

class CollegeStudent extends Student
{
    int year;
    String branch;
}

class Test
{
    public static void main(String[] args) {

    }
}