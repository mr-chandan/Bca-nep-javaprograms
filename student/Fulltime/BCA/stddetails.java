// 12.Create a package‘ student.Fulltime.BCA‘ in your current working directory a. Create a default class student in the above package
//  with the following attributes: Name, age, sex. b. Have methods for storing as well as displaying

package student.Fulltime.BCA;

public class stddetails
{
    String name;
    int age;
    String sex;

    public stddetails( String a,int e, String f)
    {
        age = e;
        sex = f;
        name = a;
    }

    public void display()
    {
        System.out.println("STUDENT PERSONAL DETAILS");
        System.out.println("Name of the student is: " + name);
        System.out.println("Age=" + age);
        System.out.println("Student is " + sex);
    }
}