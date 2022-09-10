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
            for (int j = i + 1; j < emp.length; j++) {
                if (emp[i].appdate.after(emp[j].appdate)) {
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