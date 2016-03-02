/**
 * Created by kevin_000 on 2/16/2016.
 */
public class ChargeAccount
{
    private int accountNumber;

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }


    public static boolean checkInArray(int accountNumber, int[] myArray) {

        boolean found = false;
        int index = 0;


        while (!found && index < myArray.length)
        {
            if (myArray[index] == accountNumber)
            {
                found = true;

            }
            else
            {
                found = false;

            }

            ++index;
        }


        if (found == true)
        {
            System.out.println("That account matches");
        }
        else
        {
            System.out.println("That is not a valid account");
        }

        return found;

    }




}
