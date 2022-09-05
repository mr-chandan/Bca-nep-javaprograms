// 3. Write a program to demonstrate a division by zero exception

class Program_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide the number by zero");
        }
    }
}

// Output: Cannot divide the number by zero