package week6program;

import java.util.Locale;
import java.util.Scanner;

/*19. Write a Java program to convert a given string into lowercase. Sample
Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog*/
public class Pro19 {

    public static void main(String[] args){//Main Method
        Scanner in = new Scanner(System.in);// Scanner Method
        System.out.print("Input a String: ");//Print Statement
        String line = in.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
