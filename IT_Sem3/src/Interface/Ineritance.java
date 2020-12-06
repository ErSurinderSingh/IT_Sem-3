package Interface;

import java.util.Scanner;

class Student {

    String name, gender, email, dob, mobile;
    int age;
    Scanner S = new Scanner(System.in);
    
    public void getData() {
        System.out.print("Enter Name: ");
        name = S.next();
        System.out.print("Enter E-Mail ID: ");
        email = S.next();
        System.out.print("Enter Age: ");
        age = S.nextInt();
        System.out.print("Enter Contact No: ");
        mobile = S.next();//TAKEN AS STRING BECAUSE OF RANGE OF INTEGER
        System.out.print("Enter Date of Bith: ");
        dob = S.next();
    }
    
    public void displayData(){
        //System.out.println("Name: " + name);
        System.out.println("E-Mail ID: " + email);
        System.out.println("Age: " + age);
        System.out.println("Contact No: " + mobile);
        System.out.println("Date of Bith: " + dob);
    }
}

class UG_Student extends Student {

    String college, branch;
    int sem;
    
    @Override
    public void getData() {
        System.out.print("Enter Your College: ");
        college = S.next();
        System.out.print("Enter Your Branch: ");
        branch = S.next();
        System.out.print("Enter Yor Semester: ");
        sem = S.nextInt();
    }
    
    @Override
    public void displayData(){
        System.out.println("Name: " + name);
        System.out.println("Your College: " + college);
        System.out.println("Enter Your Branch: " + branch);
        System.out.println("Enter Yor Semester: " + sem);
    }
}

public class Ineritance {
    public static void main(String[] args) {
        Student S = new Student();
        
        UG_Student ug = new UG_Student();
        
        //Accepting values from User
        S.getData();
        ug.getData();
        
        //Displaying Entered Values
        S.displayData();
        ug.displayData();
    }
}
