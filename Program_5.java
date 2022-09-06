// 5. Write a java program to add two integers and two float numbers. When no arguments are supplied,
// give a default value to calculate the sum. Use function overloading

class addsum {
    int a, b;

    addsum() {
        a = 10;
        b = 5;
    }

    void add() {
        int c = a + b;
        System.out.println("sum is " + c);
    }

    void add(int a, int b) {
        int c = a + b;
        System.out.println("sum is " + c);
    }

    void add(double a, double b) {
        double c = a + b;
        System.out.println("sum is " + c);
    }
}

class Program_5 {
    public static void main(String[] args) {
        addsum a1 = new addsum();
        a1.add();
        a1.add(20, 40);
        a1.add(6.5, 7.4);
    }
}

// Output:
// sum is 15
// sum is 60
// sum is 13.9