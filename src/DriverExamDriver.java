import java.util.Scanner;

/**
 * Created by kevin_000 on 2/16/2016.
 */
public class DriverExamDriver
{
    public static void main(String[] args)
    {
        int num = 1;
        Scanner input = new Scanner(System.in);
        char[] answers = {'b','d','a','a','c','a','b','a','c','d','b','c','d','a','d','c','c','b','d','a'};
        char[] userChoice = new char[20];
        for (int x = 0; x < 20; x++)
        {
            System.out.println(num + ". Enter your answer Ex. a-d lower case ");
            char userAnswer = input.next(".").charAt(0);
            if (userAnswer == 'A' || userAnswer == 'a' || userAnswer == 'B' || userAnswer == 'b' || userAnswer == 'C' || userAnswer == 'c' || userAnswer == 'D' || userAnswer == 'd')
            {
                userChoice[x] = userAnswer;
            }
            else
            {
                System.out.println("Invalid input ");
                --x;
                --num;

            }
            num++;
        }
        DriverExam examOne = new DriverExam();
        examOne.getTotalCorrect(answers,userChoice);
        examOne.passed();
        int[] name = examOne.questionsMissed(answers,userChoice);
        for (int x = 0; x < name.length; x ++ )
        {
            System.out.println("you missed " + name[x]);
        }


    }
}
