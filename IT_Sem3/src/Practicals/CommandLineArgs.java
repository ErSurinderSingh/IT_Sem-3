package Practicals;

public class CommandLineArgs {
    
    public static void main(String[] args) {
        
        //Extracting values entered by user at runtime from the args array or the COMMANDLINE ARGUMENTS
        int a = Integer.parseInt(args[0]);
        
        int b = Integer.parseInt(args[1]);
        
        System.out.println("Sum of " + a + " + " + b + " is: " + (a + b));
    }
}
