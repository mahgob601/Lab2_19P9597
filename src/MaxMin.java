public class MaxMin
{
    private double[] myarr;

    public String findMinMax()
    {
        int len = myarr.length;
        if(len == 0)
            return("Error: Empty array");
        else
        {
            double max = myarr[0];
            double min = myarr[0];
            String max1;
            String min1;
            for(int i = 0; i < len; i++)
            {
                if(myarr[i] > max)
                    max = myarr[i];
                else if(myarr[i] < min)
                    min = myarr[i];
            }
            if(max == (int) max)
            {
                max1 = Integer.toString((int) max);
            }
            else
            {
                max1 = Double.toString(max);
            }
            if(min == (int) min)
            {
                min1 = Integer.toString((int) min);
            }
            else
            {
                min1 = Double.toString(min);
            }



            String result = "Max: " + max1 + " ,Min: " + min1;

            return result;

        }

    }

    public void initArray(double[] arr)
    {
        myarr = arr;

    }
}
