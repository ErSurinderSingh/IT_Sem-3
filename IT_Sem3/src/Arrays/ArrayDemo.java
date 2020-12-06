package Arrays;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        
        Scanner S = new Scanner(System.in);
        int marks[]; /*= {1, 2, 3, 4, 5};*/
        marks = new  int[10];
        for(int i = 0; i< marks.length; i++)
            marks[i] = S.nextInt();
            
        for(int i = 0; i< marks.length; i++)
            System.out.print(marks[i] + " ");
    }
    
}
