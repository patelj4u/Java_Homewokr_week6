package week6program;
/* Write a program for a calculator with addition, subtraction, multiplication and division methods all with parameters and
   use string concatenation methods.(Note: Two static and Two instance methods.) */
public class Prg5_Calculator {

        public void addition(int a, int b){
            System.out.println("Addition is = " +(a+b));
            System.out.println("Addition is " + a + " + " + b + " = " +(a+b));

    }
    public void subtraction(int a, int b){
        System.out.println("Subtraction is = " +(a-b));
        System.out.println("Subtraction is " + a + " - " + b + " = " +(a-b));
    }

    public static void multiplication(int a, int b){
        System.out.println("Multiplication is = " +(a*b));
        System.out.println("Multiplication is " + a + " * " + b + " = " +(a*b));
    }

    public static void division(int a, int b){
        System.out.println("Division is = " +(a/b));
        System.out.println("Division is " + a + " / " + b + " = " +(a/b));
    }



    public static void main(String[] args) {
        Prg5_Calculator obj = new Prg5_Calculator();
        obj.addition(10,20);
        obj.addition(100,20);
        obj.subtraction(20,5);
        obj.subtraction(5,5);
        Prg5_Calculator.multiplication(5,5);
        Prg5_Calculator.division(20,5);

        }



    }



