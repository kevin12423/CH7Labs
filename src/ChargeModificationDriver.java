import java.util.Scanner;
import java.io.*;
/**
 * Created by kevin_000 on 2/16/2016.
 */
public class ChargeModificationDriver
{
    public static void main(String[] args) throws IOException
    {
        File myFile = new File("C:\\Users\\kevin_000\\Desktop\\AccountNumbres.txt");
        Scanner inputFile = new Scanner(myFile);
        Scanner input = new Scanner(System.in);
        int[] validNumbers = new int[18];

            for (int x = 0; x < validNumbers.length; x++)
            {
                int x2 = inputFile.nextInt();
                validNumbers[x] = x2;
            }
        System.out.println("Please enter an account number");
        int accountOne = input.nextInt();
        ChargeAccount.checkInArray(accountOne,validNumbers);
        inputFile.close();

    }

}
