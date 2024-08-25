class Calculator {
    int a;
    public int add () {
        System.out.println("adding...");
        return 0;
    }
}

public class Demo {
    public static void main(String a[]) {
        // Calculator calc ; // here you are only creating a reference and not a object
        Calculator calc = new Calculator(); // new object created using new and constructor
        calc.add();
    }
}

// Object Oriented Programming 
// Object : Property and Behaviour
// JVM creates object from class file
// class file is compiled to byte code
