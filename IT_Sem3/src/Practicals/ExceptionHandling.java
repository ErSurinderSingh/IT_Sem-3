package Practicals;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a, b;
        Scanner S = new Scanner(System.in);
        System.out.print("Enter 2 Integer Values: ");
        a = S.nextInt();
        b = S.nextInt();
        try{
            System.out.println(a/b);
            System.out.println("Exception Generated....");
        }catch(Exception e){
            System.out.println(e.toString());
        }finally{
            System.out.println("Finally Exceuted...");
        }
        
    }
    
}
