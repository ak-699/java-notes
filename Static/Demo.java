

class Mobile {
    String brand;
    int price;
    static String name;

    // to have some values when objects are created we use constructors
    // when object is created the constructor will be called 
    // for every object a constructor will be called 
    // so everytime the static variable will be initialized
    // why initialize a static variable everytime
    // to solve this we have a static block
    // irrespective of how many blocks you create the block will run only once 
    // static block will first before constructor even if there order is reversed
    static {
        name = "Abhishek"; 
        System.out.println("in static block");
    }

    // a constructor has no return type and is always private
    public Mobile() {
        brand = "";
        price = 200;
        // name = "Abhishek";
        System.out.println("in constructor");
    }
    // when you make a variable static that variable is common for all the objects 
    // static variable is shared by all the objects
    // if you change the static variable it will affect all the variables
    public void show() {
        System.out.println(brand+" " + price+" "+name);
    }
}

public class Demo 
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        /* -------------------------------------------------------------------------- */
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 15000;
        // obj1.name = "Smartphone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 12000;
        // obj2.name = "Smartphone";

        // obj2.name = "Abhishek";
        // The static field Mobile.name should be accessed in a static way

        // obj1.show();
        // obj2.show();
        // Mobile obj2  = new Mobile();

        // static variables should be called with their class names not with their object names
        // you can call with objects but avoid it
        // System.out.println(Mobile.name);

        Class.forName("Mobile");
        // the system class loader is used 
        // the class will only be loaded and not instantiated
        /* -------------------------------------------------------------------------- */

        // static method
    }
}

// in jvm you have a stack where you have all the references, locations and addresses
// and then you have a heap memory where your objects will be created 
// each object will have a addresss 
// these addresses will be stored by references in stack 
// there is separate area in jvm where there is all the static variables
// when you use static for variables you are making it a class member and not a object member


// in non static methods you can you static variables

// when you create object their are two steps
// 1. your class loads then your object is instantiated
// your class will load only once
// in jvm there is a special area called class loader
// it has all the class which are loaded 
// when class is loaded then static block is called then constructor is called

// if you never create any object of a class the class will never be loaded and the static block will never run
// to load a class without ever creating a object use the Class class
