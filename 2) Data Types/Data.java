public class Data {
    public static void main (String a[]) {
        float marks = 6.5f; //float
        double d_marks = 6.5; //double
        // byte b = 129 // error cannnot convert int to byte 
        byte b = 127;
        short sh = 558;

        // Integer literals 
        int num1 = 0b1101;
        int num2 = 0x7E;
        int num3 = 1_00_00_000;
        // System.out.println(b); // prints 127
        // System.out.println(num1); // prints 13
        // System.out.println(num2); // prints 126
        // System.out.println(num3); // prints 10000000

        // Floating literals
        double num4 = 12e10;
        // System.out.println(num4); // prints 1.2E11

        // boolean literals
        // boolean bln = 1; // error: cannot convert int to boolean

        // char literals 
        char c = 'a';
        c++;
        System.out.println(c);


    }
}

// Data types: 
// 1) Primitive
// integer: byte(1 bytes), short(2 bytes), int(4 bytes), long(8 bytes)
// float : double(8 byete) default, float(4 byte)
// char: char(2 bytes) unicode
// use single quote , double quote for strings
// boolean: true/false
// boolean is true and false and not 0,1 
// boolean for declaring boolean variable
