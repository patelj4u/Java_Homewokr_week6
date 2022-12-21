package week6program;

import java.util.Scanner;

public class Prg10_Multiplication {
    int n = 8;  //Instance Variable
    public static void main(String[] args) {  //Main Method

        Prg10_Multiplication abc = new Prg10_Multiplication();

        //Multiplication Table
        for (int i = 1; i<=10; i++){
            System.out.println(abc.n +" * " +i + " = " + (abc.n * i));
        }
    }
}
