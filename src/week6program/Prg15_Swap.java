package week6program;

public class Prg15_Swap {

    public static void main(String[] args) { //Main Method Or Pre defined

        // int, double, float
        int a, b;//Declard
        a = 20;
        b = 30;
        System.out.println("Before swapping : a, b = "+a+", "+ + b);//Print Statement
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = "+a+", "+ + b);//Print Statement
    }

}

