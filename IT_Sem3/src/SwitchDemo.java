
import java.util.*;

class SwitchDemo {

    public static void main(String args[]) {
        char ch;
        float a, b;
        Scanner S = new Scanner(System.in);
        System.out.println("\nEnter 2 Float values: ");
        a = S.nextFloat();
        b = Float.parseFloat(S.next());
        System.out.println("\nEnter Any Opeartor (+, -, * , /): ");
        ch = S.next().charAt(0);
        /*OR
		String s = S.next();
		ch = s.charAt(0);
         */
        switch (ch) {
            case '+':
                System.out.println("\nSum of " + a + " + " + b + "is: " + (a + b));
                break;
            case '-':
                System.out.println("\nDifference of " + a + " - " + b + "is: " + (a - b));
                break;
            case '*':
                System.out.println("\nProduct of " + a + " * " + b + "is: " + (a * b));
                break;
            case '/':
                System.out.println("\nDivision of " + a + " / " + b + "is: " + (a / b));
                break;
            default:
                System.out.println("\nU have entered wrong choice: ");

        }
    }
}

//WAP to check entered character vowel is vowel or not ignoring case sensitivity. aA

