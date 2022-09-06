//7.Write a program with class variable that is available for all instances of a class. Use static variable
//declaration. Observe the changes that occur in the object’s member variable values.

class student {
    int rollno;
    String name;
    static String course = "BCA";
    static String college = "Surana College";

    student(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println("Student Name=" + name);
        System.out.println("Student Rollno=" + rollno);
        System.out.println("Student Course=" + course);
        System.out.println("Student college=" + college);
        System.out.println("\n");
    }
}

public class Program_7 {
        public static void main(String args[]) {
        student s1 = new student(101, "rohit");
        student s2 = new student(117, "mohit");
        student s3 = new student(121, "rahul");
        s1.display();
        s2.display();
        s3.display();
    }
}

// output:
// Student Name=rohit
// Student Rollno=101
// Student Course=BCA
// Student college=Surana College

// Student Name=mohit
// Student Rollno=117
// Student Course=BCA
// Student college=Surana College

// Student Name=rahul
// Student Rollno=121
// Student Course=BCA
// Student college=Surana College