import java.text.DecimalFormat;

/**
 * Created by kevin_000 on 2/12/2016.
 */
public class PayRoll
{
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;


    public void setEmployeeId(int[] employeeId)
    {
       this.employeeId = employeeId;
    }

    public void setHours(int[] hours)
    {
        this.hours = hours;
    }

    public void setPayRate(double[] payRate)
    {
        this.payRate = payRate;
    }


    public static double CalcGrossPay(int hour, double pay)
    {
        double grossPay = hour * pay;
        return grossPay;

    }
    public static void FinishOutput(int idNumber, double grossPay)
    {
        DecimalFormat decFormat = new DecimalFormat("$#,##0.00");
        System.out.println("");
        System.out.println(idNumber + "'s gross pay is " + decFormat.format(grossPay));

    }
}
