package ArithOpTest;

import AithmeticOp.ArithmeticOperators;
import java.util.Scanner;

public class ArithmeticTest extends ArithmeticOperators {

    public static void main(String[] s) {
        
        Scanner S = new Scanner(System.in);
        System.out.print("Enter 2 Integer Values: ");
        int x = S.nextInt();
        int y = S.nextInt();
        
        ArithmeticOperators test = new ArithmeticOperators();
        ArithmeticTest test1 = new ArithmeticTest();
        
        System.out.println("\nSum of "+ x + " + " + y +" is: " + test.addition(x, y));
        
        //Accessed through Inheritance, as method defined has protected access.
        System.out.println("\nDifference of "+ x + " - " + y +" is: " + test1.subtarction(x, y));

        try{
            System.out.println("\nProduct of "+ x + " * " + y +" is: " + test.multiplication(x, y));
        }catch(Exception e){
            System.out.println("\n\033[31;1mERROR: Method multiplication(int,int) has private access in ArithmeticOperators");
        }

        try{
            System.out.println("\nDivision of "+ x + " / " + y +" is: " + test.division(x, y));
        
        }catch(Exception e1){
            System.out.println("\n\033[31;1mERROR: Method division(int,int) is not public in ArithmeticOperators & can't be accessed from outside package\n");
        }

    }
}
