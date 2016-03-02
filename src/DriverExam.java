/**
 * Created by kevin_000 on 2/16/2016.
 */
public class DriverExam
{
    private char[] answers;
    private char[] userAnswers;
    int index = 0;
    private int totalCorrect;


    public int getTotalCorrect(char[] userAn, char[] answers)
    {
        int right = 0;
        for (int x = 0; x < answers.length; x++)
        {
            if(userAn[x] == answers[x])
            {
                right++;
            }
        }
        totalCorrect = right;
        return right;

    }

    public int getTotalMissed()
    {
         return 20 - totalCorrect;

    }

    public boolean passed()
    {
        boolean pass = false;

        if(totalCorrect >= 15)
        {
            System.out.println("You passed!");
            pass = true;
        }
        else
        {
            System.out.println("Please retake the exam");
        }
        return pass;

    }


    public int[] questionsMissed(char[] answers, char[] userAnswers)
    {
        int[] numbersWrong = new int[getTotalMissed()];
        int x2=0;
        for (int x = 0; x < answers.length; x++)
        {
            if (userAnswers[x] != answers[x])
            {
                numbersWrong[x2] = (x+1);
                x2++;
            }


        }
        return numbersWrong;

    }










}
