// 11. Write a Java program to define a class called employee with the name and date of appointment. Create
// ten employee objects as an array and sort them as per their date of appointment. ie, print them as per
// their seniority. 

import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class employee {
    String name;
    Date appdate;

    employee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name");
        name = sc.next();
        System.out.println("Enter date of appointment in dd/MM/yyyy format");
        String date = sc.next();
        try {
            appdate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (Exception e) {
            System.out.println("Not in correct format");
        }
    }

    public void display() {
        System.out.println("employee name : " + name + "  appoinment date: " + appdate);
    }
}

class Program_11 {
    public static void main(String as[]) {

        employee emp[] = new employee[3];
        System.out.println("List of employees");

        for (int i = 0; i < emp.length; i++) {
            emp[i] = new employee();
        }

        for (int i = 0; i < emp.length; i++) {
            for (int j = 0; j < emp.length; j++) {
                if (emp[i].appdate.before(emp[j].appdate)) {
                    employee temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }

        System.out.println("List of employees seniority wise");
        for (int i = 0; i < emp.length; i++) {
            emp[i].display();
        }
    }
}



// Output:
// List of employees
// Enter Employee name
// ram
// Enter date of appointment in dd/MM/yyyy format
// 14/12/2003
// Enter Employee name
// som
// Enter date of appointment in dd/MM/yyyy format
// 13/11/2003 
// Enter Employee name
// bam
// Enter date of appointment in dd/MM/yyyy format
// 14/12/2003
// List of employees seniority wise
// employee name : som  appoinment date: Thu Nov 13 00:00:00 IST 2003
// employee name : ram  appoinment date: Sun Dec 14 00:00:00 IST 2003
// employee name : bam  appoinment date: Sun Dec 14 00:00:00 IST 2003
