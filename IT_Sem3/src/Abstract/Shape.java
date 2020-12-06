package Abstract;

abstract public class Shape {
    //ABSTRACT METHOD
    abstract void area();
    
    //NON ABSTRACT OR CONCRETE OR REGULAR
    void print(){
        System.out.println("In Abstract Class:");
    }
}

class Rectangle extends Shape{
    int len = 5, bre = 9;
    @Override
    void area(){
        
        System.out.println("Area of Rectangle is: " + (len * bre));
    }
    
}

class Circle extends Shape{
    int r = 4;
    void area(){
        System.out.println("Area of Circle is: " + (3.14 * r * r));
    }
}

class ShapeTest{
    public static void main(String[] args) {
        Rectangle R  = new Rectangle();
        R.area();
        
        Circle C = new Circle();
        C.area();
    }
}