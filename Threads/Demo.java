class A extends Thread{
    public void show () {
        for (int i = 0; i<10; i++) {

            System.out.println("Hi A");
        }
    }
}
class B extends Thread{
    public void show () {
        for (int i = 0; i<10; ++i) {
            System.out.println("Hi B");
        }
    }
}

public class Demo {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        a.show();
        b.show();
    }
}
