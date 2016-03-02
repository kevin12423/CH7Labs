import java.util.Scanner;

/**
 * Created by kevin_000 on 2/12/2016.
 */
public class PayRollDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        PayRoll month1 = new PayRoll();
        int[] idNumbers = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
        int[] hours = new int[7];
        double[] payRate = new double[7];
       // double[] wages = new double[7];
        month1.setEmployeeId(idNumbers);

        for (int x = 0; x < idNumbers.length; x++)
        {
            System.out.println("Employee " + idNumbers[x]);
            System.out.println("Please enter the amount of hours worked");
            hours[x]= input.nextInt();
            if (hours[x] >= 0)
            {
                System.out.println("Please enter the pay rate");
                payRate[x] = input.nextDouble();
                if(payRate[x] > 6)
                {
                    PayRoll.CalcGrossPay(hours[x], payRate[x]);
                }
                else
                {
                    System.out.println("You must enter at least $6 please restart the program");
                }
            }
            else
            {
                System.out.println("Please enter a positive number for hours worked");
                System.out.println("Please restart the program");
            }

        }
        month1.setHours(hours);
        month1.setPayRate(payRate);
        for (int x = 0; x < idNumbers.length; x++)
        {
            PayRoll.FinishOutput(idNumbers[x],PayRoll.CalcGrossPay(hours[x],payRate[x]));
        }


    }
}
