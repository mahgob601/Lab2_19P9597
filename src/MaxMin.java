public class MaxMin
{

    public String findMinMax(double arr[])
    {
        int len = arr.length;
        if(len == 0)
            return("Error: Empty array");
        else
        {
            double max = arr[0];
            double min = arr[0];
            String max1;
            String min1;
            for(int i = 0; i < len; i++)
            {
                if(arr[i] > max)
                    max = arr[i];
                else if(arr[i] < min)
                    min = arr[i];
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
}
