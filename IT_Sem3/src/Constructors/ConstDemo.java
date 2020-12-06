package Constructors;

public class ConstDemo {
    int a;
    float b;
    boolean c;

    public ConstDemo() {
        a = 1;
        b = 1.2f;
        c = true;
    }
    
    void display(){
        System.out.println(a + " " + b + " " + c );
    }
    
    public static void main(String[] args) {
        ConstDemo C = new ConstDemo();
        C.display();
    }
}
