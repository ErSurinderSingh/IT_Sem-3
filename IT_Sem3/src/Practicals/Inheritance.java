package Practicals;

import java.util.Scanner;

class Student {

    String name, email, mobile, dob;
    int age;
    Scanner S = new Scanner(System.in);
    
    Student(){
        
    }
    
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
    
    public void displayData() {
        System.out.println("==================================");
        System.out.println("---------Student Details:---------");
        System.out.println("==================================");
        System.out.println("Name: " + name);
        System.out.println("E-Mail ID: " + email);
        System.out.println("Age: " + age);
        System.out.println("Contact No: " + mobile);
        System.out.println("Date of Bith: " + dob);
    }
}

class UG_Student extends Student {

    String college, branch;
    int sem;
    
    Student s = new Student();
    
    
    @Override
    public void getData() {
        s.getData();
        System.out.print("Enter Your College: ");
        college = S.next();
        System.out.print("Enter Your Branch: ");
        branch = S.next();
        System.out.print("Enter Yor Semester: ");
        sem = S.nextInt();
    }
    
    @Override
    public void displayData() {
        s.displayData();
        System.out.println("Your College: " + college);
        System.out.println("Enter Your Branch: " + branch);
        System.out.println("Enter Yor Semester: " + sem);
    }
}

public class Inheritance {
    public static void main(String[] args) {
       UG_Student S = new UG_Student();
       S.getData();
       S.displayData();
    }
}
