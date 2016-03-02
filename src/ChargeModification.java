import java.io.File;

/**
 * Created by kevin_000 on 2/16/2016.
 */
public class ChargeModification
{

    private int accountNumber;

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }


    public static boolean checkInArray(int legal, int[] myArray) {

        boolean found = false;
        int index = 0;


        while (!found && index < myArray.length)
        {
            if (myArray[index] == legal)
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

