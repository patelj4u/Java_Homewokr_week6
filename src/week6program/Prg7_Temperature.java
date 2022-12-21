package week6program;

import java.util.Scanner;
/* Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C)*/

public class Prg7_Temperature {
    public static void main(String[] args) { //Main Method
        float c,f;

        //user input
        Scanner sc = new Scanner(System.in);//Scanner class method
        System.out.println("0c");
        c = sc.nextFloat();
        //convert celsius to fahrenheit
        float cel = 0;
        f = cel * 9/5 + 32;

        System.out.println("+ 9/5 ");// Print Statement
        System.out.println("\n Fahrenheit value is : "+f);// Print Statement
        
    }
}
