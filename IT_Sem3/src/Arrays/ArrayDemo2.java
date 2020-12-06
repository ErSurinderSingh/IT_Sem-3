package Arrays;

import java.util.Scanner;

public class ArrayDemo2 {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        int marks[][];
        marks = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = S.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
            }
        }
    }

}
