/**
 * Created by kevin_000 on 2/11/2016.
 */

public class RainFall
{
    private double[] rainFall;

    public RainFall(double[] r)
    {
        rainFall = new double[12];
        for (int x = 0; x < rainFall.length; x++)
        {
            this.rainFall[x] = r[x];
        }
    }
    public double getTotalRainFall()
    {
        double total = 0.0;
        for (double value : rainFall)
        {
            total += value;
        }
        return total;
    }
    public double getMonthyRain()
    {
       return getTotalRainFall() / 12;
    }
    public double getMostRain()
    {
        double max = rainFall[0];

        double i2 = 0;
        for (int i = 0; i < rainFall.length; i++)
        {
            if (rainFall[i] > max)
            {
                max = rainFall[i];
                 i2 = i + 1;
            }
            if(i2 == 0)
            {
                i2 = 1;
            }
        }
        return i2;

    }
    public double getLeastRain()
    {
        double min = rainFall[0];
        double i2 = 0;

        for (int i = 0; i < rainFall.length; i++)
        {
            if (rainFall[i] < min)
            {
                min = rainFall[i];
                i2 = i + 1;
            }
            if(i2 == 0)
            {
                i2 = 1;
            }
        }
        return i2;

    }
}
