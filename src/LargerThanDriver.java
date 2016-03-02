import java.util.Scanner;

/**
 * Created by kevin_000 on 2/16/2016.
 */
public class LargerThanDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] numbers = {500,567,345,900,50,23,56,77,88,34};
        System.out.println("Please enter an integer");
        int user = input.nextInt();
        calcIfBigger(user,numbers);
    }


    public static void calcIfBigger(int num, int[] number)
    {
        for (int x = 0; x < number.length; x++)
        {
            if (num < number[x])
            {
                System.out.println(number[x]);
            }
        }
    }

}
