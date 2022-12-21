package extrahomework;

import java.text.MessageFormat;

//Write a java program to concat 2 string. Expected output: I love java I eat java
public class Prog5_Concat {
    public static void main(String[] args) {//Main method
        String name ="I love java";
        String name1 ="I eat java ";
        String name2 = name.concat( name1);
        System.out.println("name:" + name);//Print Statement
        System.out.println("name1:" +name1);//Print Statement
        System.out.println("The concatenated string:" + name2);//Print Statement



    }
}
