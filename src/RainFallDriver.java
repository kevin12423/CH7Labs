import java.util.Scanner;

/**
 * Created by kevin_000 on 2/11/2016.
 */

public class RainFallDriver
{
    public static void main(String[] args)
    {
            Scanner input = new Scanner(System.in);
            double[] rainFallArray = new double[12];

            for (int x = 0; x < rainFallArray.length; x++)
            {
                System.out.println("Please enter the amount of rain");
                double rainFall = input.nextDouble();
                if(rainFall >= 0)
                {
                    rainFallArray[x] = rainFall;
                }
                else
                {
                    System.out.println("Please enter a positive number for rain fall");
                    --x;
                }
            }
            RainFall yearOne = new RainFall(rainFallArray);
            System.out.println("Total Rain fall for the year is " + yearOne.getTotalRainFall());
            System.out.println("The average Rain fall for a month is " + yearOne.getMonthyRain());
            System.out.println("The least amount of Rain fall is month " + yearOne.getLeastRain());
            System.out.println("The most amount of Rain fall is month " + yearOne.getMostRain());


    }


}
