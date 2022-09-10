// 11. Write a Java program to define a class called employee with the name and date of appointment. Create
// ten employee objects as an array and sort them as per their date of appointment. ie, print them as per
// their seniority. 

import java.util.Date;

class employee {
    String name;
    Date appdate;

    public employee(String nm, Date apdt) {
        name = nm;
        appdate = apdt;
    }

    public void display() {
        System.out.println("employee name:" + name + " appoinment date:" + appdate.getDate() + "/" + appdate.getMonth()
                + "/" + appdate.getYear());
    }

    public static void main(String args[]) {

        employee emp[] = new employee[5];

        emp[0] = new employee("RAM", new Date(2022, 3, 20));
        emp[1] = new employee("RAJ", new Date(2022, 4, 7));
        emp[2] = new employee("BAM", new Date(2022, 3, 10));
        emp[3] = new employee("SAM", new Date(2022, 8, 1));
        emp[4] = new employee("SOM", new Date(2022, 7, 4));

        System.out.println("List of employees");
        for (int i = 0; i < emp.length; i++)
            emp[i].display();

        for (int i = 0; i < emp.length; i++) {
<<<<<<< HEAD
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].appdate.after(emp[j].appdate)) {
=======
            emp[i] = new employee();
        }

        for (int i = 0; i < emp.length; i++) {
            for (int j = 0; j < emp.length; j++) {
                if (emp[i].appdate.before(emp[j].appdate)) {
>>>>>>> de3e680ac8999ca2237d77a9f287902885e9b6fa
                    employee temp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = temp;
                }
            }
        }
        System.out.println("List of employees oreder of seniority wise");
        for (int i = 0; i < emp.length; i++)
            emp[i].display();
    }
}

// Output:
// List of employees
<<<<<<< HEAD
// employee name:RAM appoinment date:20/3/2022
// employee name:RAJ appoinment date:7/4/2022
// employee name:BAM appoinment date:10/3/2022
// employee name:SAM appoinment date:1/8/2022
// employee name:SOM appoinment date:4/7/2022

// List of employees oreder of seniority wise

// employee name:BAM appoinment date:10/3/2022
// employee name:RAM appoinment date:20/3/2022
// employee name:RAJ appoinment date:7/4/2022
// employee name:SOM appoinment date:4/7/2022
// employee name:SAM appoinment date:1/8/2022
=======
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
>>>>>>> de3e680ac8999ca2237d77a9f287902885e9b6fa
