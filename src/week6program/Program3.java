package week6program;

public class Program3 {

    //3.1 Declare one instance and one static variable.

    String name = "Charmi";  // Declared Instance Variable

    static String name1 = "Mishv"; // Declared static Variable

    //3.2 Declare one instance method.
    public void charmi(){    //Declared Instance method
        System.out.println(name);
        System.out.println(name1);

    }

    //3.3 Declare one static method.
    public static void mishv(){    //Declared static method
       Program3 jiten = new Program3();
        System.out.println(name1);

       System.out.println(jiten.name);

    }

    //3.5 Declare the Main method.
    public static void main(String[] args) {
        Program3 prg = new Program3()
        prg.charmi();
        Program3.mishv();
    }

    //3.6 Call both instance and static methods into the Main method and run the programme.







}
