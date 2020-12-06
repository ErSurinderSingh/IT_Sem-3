package Practicals;

import java.util.Scanner;

public class MethodPrototyping {
    
    static int a, b;
    static float c;
    static double d, e;
    
    int add(int a, int b){
        return a + b;
    }
    float add(int a, float b){
        return a + b;
    }
    double add(double a, double b, int c){
        return a + b + c;
    }
    
    public void input(){
        Scanner S = new Scanner(System.in);
        System.out.print("Enter 2 Integer Values:");
        a = S.nextInt();
        b = S.nextInt();
        
        System.out.print("Enter Float Value: ");
        c = S.nextFloat();
        
        System.out.print("Enter 2 Double Values: ");
        d = S.nextDouble();
        e = S.nextDouble();
    }
    public static void main(String[] args) {
        MethodPrototyping p2 = new MethodPrototyping();
        p2.input();
        
        System.out.println("Sum of "+ a + " + " + b + " is: " + p2.add(a,b));
        
        System.out.println("Sum of "+ a + " + " + c + " is: " + p2.add(a,c));
        
        double sum = p2.add(d, e, a);
        System.out.println("Sum of "+ d + " + " + e + " + " + a + " is: " + sum); 
    }
}
