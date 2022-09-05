// 13. Write a small program to catch Negative Array Size Exception. This exception is caused when the
// array is initialized to negative values. 

public class Program_13 {
    public static void main(String[] args) {

        try {
            int god[] = new int[-10];
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
            System.out.println("Oops!!..Found a negative array exception");
        }

    }
}

// output:
// java.lang.NegativeArraySizeException: -10
// Oops!!..Found a negative array exception