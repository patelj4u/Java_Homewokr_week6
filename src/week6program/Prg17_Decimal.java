package week6program;

public class Prg17_Decimal {
    //Write a Java program to convert a decimal number to binary number.
    //
    //Input Data:
    //Input a Decimal Number : 5
    //Expected Output
    public static void main(String[] args) {//Main Method

        {
            int dec_num = 5, quot, i=1, j;
            int bin_num[] = new int[100];

            System.out.print("Input a Decimal Number :5 ");//Print Statement


            quot = dec_num;

            while(quot != 0)
            {
                bin_num[i++] = quot%2;
                quot = quot/2;
            }

            System.out.print("Binary number is: ");//print
            for(j=i-1; j>0; j--)
            {
                System.out.print(bin_num[j]);
            }
            System.out.print("\n");
        }


    }
}
