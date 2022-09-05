// 2. Write a program to display the month of a year. Months of the year should be held in an array. 

import java.util.Calendar;

class Program_2 {
   public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      String[] month = new String[] { "Jan", "Feb", "March", "April", "May", "Jun", "July", "August", "September",
            "October", "November", "December" };
      System.out.println("Current month = " + month[cal.get(Calendar.MONTH)]);
   }
}

// Output: The Respective month