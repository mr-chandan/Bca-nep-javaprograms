// 8. Write a java program to create a student class with following attributes: Enrollment_id: Name, Mark
// of sub1, Mark of sub2, mark of sub3, Total Marks. Total of the three marks must be calculated only
// when the student passes in all three subjects. The pass mark for each subject is 50. If a candidate fails
// in any one of the subjects his total mark must be declaredas zero. Using this condition write a
// constructor for this class. Write separate functions for accepting and displaying student details. In the
// main method create an array of three student objects and display the details. 

import java.util.*;

class student {

    String Enrollementid;
    String name;
    int marks1, marks2, marks3;
    int total;

    student() {
        readdata();
    }

    public void readdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student details");
        System.out.println("Enter student id");
        Enrollementid = sc.next();
        System.out.println("Enter student name");
        name = sc.next();
        System.out.println("Enter mark 1");
        int marks1 = sc.nextInt();
        System.out.println("Enter mark 2");
        int marks2 = sc.nextInt();
        System.out.println("Enter mark 3");
        int marks3 = sc.nextInt();
        if (marks1 >= 50 && marks2 >= 50 && marks3 >= 50)
            total = marks1 + marks2 + marks3;
        else
            total = 0;
    }

    public void display() {
        System.out.println("student regno : " + Enrollementid + "student name : " + name + " total marks : " + total);
    }
}

public class Program_8 {
    public static void main(String args[]) {
        student S[] = new student[3];
        for (int i = 0; i < 3; i++)
            S[i] = new student();
        System.out.println("\t\t student info");
        for (int i = 0; i < 3; i++)
            S[i].display();
    }
}

// Output:
// Enter student details
// Enter student id
// 123
// Enter student name
// RAM
// Enter mark 1
// 40
// Enter mark 2
// 50
// Enter mark 3
// 90
// Enter student details
// Enter student id
// 456
// Enter student name
// BAM
// Enter mark 1
// 50
// Enter mark 2
// 70
// Enter mark 3
// 90
// Enter student details
// Enter student id
// 789
// Enter student name
// JAM
// Enter mark 1
// 60
// Enter mark 2
// 90
// Enter mark 3
// 50
// student info
// student regno : 123student name : RAM total marks : 0
// student regno : 456student name : BAM total marks : 210
// student regno : 789student name : JAM total marks : 200