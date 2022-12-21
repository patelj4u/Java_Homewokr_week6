package week6program;
/*6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)*/

   import java.util.Scanner;
public class Prg6_Circle {
    public static void main(String[] args) {//Main Method

      final double PI=3.14; //area; // Area of Circle
      int r;
        System.out.print ("Enter redis of circle");//Print Statement
        Scanner ref = new Scanner(System.in);
        ref.nextInt();r=4;

        double area1 = PI * r * r;
        System.out.print("Area of circle" +area1);//Print Statement

    }
}
