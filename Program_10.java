// 10. Define a class called first year with above attributes and define a suitable constructor. Also write a method
//  called best Student () which process a first-year object and return the student with the highest total mark. In the 
//  main method define a first-year object and find the best student of this class

import java.util.*;

class firstyear {
    String classname;
    String classteacher;
    int studentcount;
    int marks[] = new int[50];
    String stdnames[] = new String[50];

    public firstyear() {
        getdata();
    }

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter class name");
        classname = sc.nextLine();
        System.out.println("enter the class teacher name");
        classteacher = sc.nextLine();
        System.out.println("Please enter the total number of students in the class");
        studentcount = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter the names of all students of the class:");
        for (int i = 0; i < studentcount; i++)
            stdnames[i] = sc.nextLine();

        System.out.println("Please enter the marks of all students of the class:");
        for (int i = 0; i < studentcount; i++)
            marks[i] = sc.nextInt();

    }

    public void bestStudent() {
        int best = 0, k = -1;
        for (int i = 0; i < studentcount; i++) {
            if (marks[i] > best) {
                best = marks[i];
                k = i;
            }
        }
        System.out.println("the best student is" + stdnames[k]);
    }
}

public class Program_10 {
    public static void main(String args[]) {
        firstyear cl = new firstyear();
        cl.bestStudent();
    }
}




// Output:
// enter class name
// bca    
// enter the class teacher name
// ramu
// Please enter the total number of students in the class
// 3
// Please enter the names of all students of the class:
// som 
// bam
// ram
// Please enter the marks of all students of the class:
// 80
// 90
// 65
// the best is bam
