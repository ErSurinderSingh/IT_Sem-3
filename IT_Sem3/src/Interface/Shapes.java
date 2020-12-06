package Interface;

interface Shape{
    void area();
    //void print();
    int num = 98;
}

class Rectangle implements Shape{
    int l = 4, b = 2;
    @Override
    public void area(){
        System.out.println("Area of Rectangle is:" + (l*b));
        //num = 87;
    }
}

class Triangle implements Shape{
    int b = 4, h = 6;
    @Override
    public void area(){
        System.out.println("Area of Triangle is:" + ((b*h)/2));
    }
}

public class Shapes{
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.area();
        Triangle T = new Triangle();
        T.area();
    }
}