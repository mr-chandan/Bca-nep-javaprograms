// 6. Write a program to perform mathematical operations. Create a class called AddSub with methods to
// add and subtract. Create another class called MulDiv that extends from AddSub class to use the
// member data of the super class. MulDiv should have methods to multiply


class AddSub{
    int a = 25,b= 5;
    void add(){
        int c = a+b;
        System.out.println("Addition of "+a+" + "+b+" = "+c);
    }
    void sub(){
        int c = a-b;
        System.out.println("Subraction of "+a+" + "+b+" = "+c);
    }
}

class MulDiv extends AddSub{
    void mul(){
        int c = a*b;
        System.out.println("Multiplication of "+a+" + "+b+" = "+c);
    }
    void div(){
        int c = a/b;
        System.out.println("Division of "+a+" + "+b+" = "+c);
    }
}
public class Program_6 {
    public static void main(String[] args) {
        System.out.println("mathematical operations");
        MulDiv inh = new MulDiv();
        inh.add();
        inh.sub();
        inh.mul();
        inh.div();
    }
}



// Output :
// mathematical operations
// Addition of 25 + 5 = 30
// Subraction of 25 + 5 = 20
// Multiplication of 25 + 5 = 125
// Division of 25 + 5 = 5