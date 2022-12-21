package week6program;//18. Write a Java program to print the sum (addition), multiply, subtract, divide and
//remainder of two numbers.
//Test Data:
//Input first number: 125
//Input second number: 24
//Expected Output :
//125 + 24 = 149
//125 - 24 = 101
//125 x 24 = 3000
//125 / 24 = 5
//125 mod 24 = 5
//



public class Prg18 {

      int a =125 ,b = 24;  //Instance Variable
    public static void main(String[] args) {
        Prg18 obj = new Prg18();
        System.out.println("Input first number : " +obj.a);
        System.out.println("Input second number : " +obj.b);
        System.out.println("Expected Output : ");
        System.out.println(obj.a +" + " + obj.b +" = " +(obj.a + obj.b));
        System.out.println(obj.a +" - " + obj.b +" =  " +(obj.a - obj.b));
        System.out.println(obj.a +" x " + obj.b +" = " +(obj.a * obj.b));
        System.out.println(obj.a +" / " + obj.b +" = " +(obj.a / obj.b));
        System.out.println(obj.a +" % " + obj.b +" = " +(obj.a % obj.b));


    }
}
