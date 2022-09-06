//4.Write a program to create a user defined exception say Pay Out of Bounds.

import java.util.*;

class OutofBounds extends Exception {
    OutofBounds(String s) {
        System.out.println("Out of Bounds Exception" + s);
    }
}

public class Program_4{
    public static void main(String args[]) throws OutofBounds {
        System.out.println("Enter the age of the person:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18 || age > 100) {
            throw new OutofBounds("person is not eligible to vote.");
        } else {
            System.out.println("person is eligible to vote.");
        }
    }
}

// output:
// Enter the age of the person:
// 25
// person is eligible to vote.
// Enter the age of the person:
// 101
// Out of Bounds Exceptionperson is not eligible to vote.