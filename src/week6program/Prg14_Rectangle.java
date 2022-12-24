package week6program;
/*14. Write a Java program to print the area and perimeter of a rectangle.

Test Data:
Width = 5.5 Height = 8.5

Expected Output:

Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/


public class Prg14_Rectangle {

    public static void main(String[] strings) { //Main Method

        final double width = 5.6;
        final double height = 8.5;

        double perimeter = 2*(height + width);

        double area = width * height;

        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);//Print Statement

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);//Print Statement


    }
}

