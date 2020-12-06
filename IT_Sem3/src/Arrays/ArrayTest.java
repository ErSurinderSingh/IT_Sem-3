package Arrays;

import java.util.Scanner;

class Array {
    int a[] = new int[10];
    int i;
    Scanner S = new Scanner(System.in);
   
    void getArray(){
       for(i = 0; i < 10; i++){
           System.out.print("\nEnter Array Value " + (i+1) + " : ");
           a[i] = S.nextInt();
       }      
       changeToOne(a);
   }
    
    int [] changeToOne(int a[]){
        for(i = 0; i < 10; i++){
            if(a[i] % 3 == 0)
                a[i] = 1;
            else
                a[i] = 0;
        }
        return a;
    }
    
    void disp(){
        for(i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
    }
}

public class ArrayTest{
    public static void main(String[] args) {
        Array A = new Array();
        A.getArray();
        //A.disp();
        
        int arr[] = {50, 60, 70, 80};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
