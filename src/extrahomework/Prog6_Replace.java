package extrahomework;
 //Write a java program which replace a “I@love@java” to “we love java” Expected output: We love java

public class Prog6_Replace {

        public static void main(String[] args) {//Main method
            String myStr = "I@love@java";//
            System.out.println(myStr.replaceAll("(.*)I@love@java(.*)","We love java"));//Print Statement

        }
}
