package week6program;
//Make class save your name in string variable and use all string methods. Add One more method Reverse String
public class Prog21_Reverse {
//ReverseString using CharcterArray.

    public static void main(String[] arg) {

// declaring variable

        String stringinput = "JITEN";

        // convert String to character array

        // by using toCharArray

        char[] resultarray = stringinput.toCharArray();

        //iteration

        for (int i = resultarray.length - 1; i >= 0; i--)

            // print reversed String

            System.out.print(resultarray[i]);

    }
}
