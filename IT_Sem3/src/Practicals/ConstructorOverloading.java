package Practicals;

import java.util.Scanner;

class Box {

    static float length, width, height;
    Scanner S = new Scanner(System.in);
    
    Box() {//DEFAULT
        length = 4.75f;
        width = 2.5f;
        height = 1.15f;
    }
    
    Box(float a, float b, float c){//CUBOID-1
        length = a;
        width = b;
        height = c;
    }
    
    Box(float a){//CUBOID-2
        length = width = height = a;
    }
    
    public float volume(){
        return length * width * height;
    }
    
    public void input(){
        System.out.print("Enter length, width & height:");
        length = S.nextFloat();
        width = S.nextFloat();
        height = S.nextFloat();
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b = new Box();
        //b.input();
        System.out.print("Volume of Box with \'length:\' " + b.length + ", \'width:\' " + b.width + " and \'height:\' " + b.height);
        System.out.println(" is: " + b.volume() + " cubic units");
        
        b.input();
        
        Box b1 = new Box(Box.length, Box.width, Box.height);
        System.out.print("Volume of Box with \'length:\' " + b.length + ", \'width:\' " + b.width + " and \'height:\' " + b.height);
        System.out.println(" is: " + b1.volume() + " cubic units");

        Box b2 = new Box(Box.length);
        System.out.print("Volume of Box with \'length:\' " + b.length + ", \'width:\' " + b.width + " and \'height:\' " + b.height);
        System.out.println(" is: " + b2.volume() + " cubic units");
    }
    
}
