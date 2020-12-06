
import java.util.Scanner;

public class SwitchDemo2 {

    public static void main(String[] args) {
        char ch;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any charcter: ");
        ch = s.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'A': System.out.println("Its a vowel"); break;
            
            case 'e':
            case 'E': System.out.println("Its a vowel"); break;
            
            case 'i':
            case 'I': System.out.println("Its a vowel"); break;
            
            case 'o':
            case 'O': System.out.println("Its a vowel"); break;
            
            case 'u':
            case 'U': System.out.println("Its a vowel"); break;
            
            default: System.out.println("Entered character is not a vowel....");
        }

    }
}
