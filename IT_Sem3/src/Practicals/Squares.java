package Practicals;

import java.util.Scanner;

public class Squares implements Square_n_Cube{

    @Override
    public double square(double n) {
        return n * n;
    }

    @Override
    public double cube(double n) {
        return n * n * n;
    }
    
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter an Integer Value: ");
        double x = S.nextDouble();
        
        Square_n_Cube s = new Squares();
        System.out.println("\nSquare of " + x + " is: " + s.square(x));
        System.out.println("\nCube of " + x + " is: " + s.cube(x));
    }
}
