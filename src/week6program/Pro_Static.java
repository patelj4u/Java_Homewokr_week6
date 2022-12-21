package week6program;

public class Pro_Static {   //Declare class name as Pro_Static
    static int sum = 100;//Declare static variable
    static int sum1 = 150;//Declare static variable

    public static void addition(){ // Declare static method name as addition
        System.out.println(sum);  // called static variable into Print statement
        System.out.println(sum1); // called static variable into Print statement
    }
    public static void main(String []args){// Main method
        Pro_Static.addition();  // Called static method using class name
    }
}
