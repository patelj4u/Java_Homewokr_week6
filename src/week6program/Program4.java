package week6program;

public class Program4 {

    //4.1 Declare two instance and two static variables.
    int a= 100;// Declared Instance Variable
    int b= 150;// Declared Instance Variable

    static int number =200;// Declared static Variable
    static int number1=300;// Declared static Variable

   //4.2 Declare one instance method.
    public void setNumber(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(number);//Declared instance method.
        System.out.println(number1);//Declared instance method.
    }
    // 4.3 Declare one static method.
    public static void setNumber1(){
        Program4 prg= new Program4();
        System.out.println(prg.a);
        System.out.println(prg.b);
        System.out.println(number);
        System.out.println(number1);
    }

    //   4.4 Call all four instance and static variables into both instance and static methods inside the print statement.

    //4.5 Declare the Main method.
    //4.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Program4 prg1 = new Program4();
        prg1.setNumber();
        Program4.setNumber1();




    }

}

