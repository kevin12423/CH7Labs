import java.util.Scanner;

/**
 * Created by kevin_000 on 2/16/2016.
 */
public class ChargeAccountDriver
{

    public static void main(String[] args)
    {
        int[] validAccounts = {5658845,8080152,1005231,4520125,4562555,6545231,7895122,5552012,3852085,8777541,
                5050552,7576651,8451277,7825877,7881200,1302850,1250255,4851002};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an account number");
        int accountOne = input.nextInt();
        ChargeAccount.checkInArray(accountOne,validAccounts);


    }



}
