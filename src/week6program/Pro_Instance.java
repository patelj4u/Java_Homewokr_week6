package week6program;

public class Pro_Instance {
    String name ="Jiten";// Instance variable
    String Surname = "Patel"; // Instance v2

    public void m1() {
        System.out.println(name);// Instance Variable called in Print
        System.out.println(Surname);// Instance Variable called in Print
    }
    public static void main(String[] args){// Main Method Declared
        Pro_Instance p = new Pro_Instance();//Create Object of instance method
        p.m1();//Calling instance method
    }
}

