// 14. Write a program to handle Null Pointer Exception and use the “finally” method to display a message to
// the user. 

 class Program_14 {
    public static void main(String[] args) {
        String s = null;

        try {
            if (s.equals("God")) {
                System.out.println("Strings are equal");
            }
        } catch (NullPointerException e) {
            System.out.println("Oops!!..Found a null Pointer Exception");
        } finally {
            System.out.println("String is == null");
            System.out.println("Executed finally block");
        }
    }
}

// output:
// Oops!!..Found a null Pointer Exception
// String is == null
// Executed finally block