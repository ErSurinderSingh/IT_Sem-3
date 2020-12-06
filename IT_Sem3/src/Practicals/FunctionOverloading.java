package Practicals;

import java.util.*;

public class FunctionOverloading {
    
    Scanner S = new Scanner(System.in);
    static int x, y, z;
    static float q;
    static char p;
    
  int average(int a, int b){
      int av = a+b;
      return (av/2);
  }
  int average(char a, int b){
      int av = a+b;
      return (av/2);
  }
  float average(int a, int b, float c){
      float av = a+b+c;
      return (av/3);
  }
  
  public void input(){
      System.out.print("Enter 3 Integer Values: ");
      x = S.nextInt();
      y = S.nextInt();
      z = S.nextInt();
      
      System.out.print("Enter a Float Value: ");
      q = S.nextFloat();
      
      System.out.print("Enter a Character: ");
      p = S.next().charAt(0);
  }
    public static void main(String[] args) {
        FunctionOverloading p3 = new FunctionOverloading();
        p3.input();
        
        System.out.println("Average of " + x + " + " + y + " is: "+ p3.average(x, y));
        
        System.out.println("Average of " + p + " + " + z + " is: "+ p3.average(p, z));
        
        System.out.println("Average of " + x + " + " + y + " + " + q + " is: " + p3.average(x, y, q));
    }
}
