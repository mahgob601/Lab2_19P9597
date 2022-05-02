public class EvenOrOdd
{

    public String evenOdd(double num)
    {
        int intVal = (int) num;
        if(intVal != num)
        {
            return("Error Not Integer");
        }
        else
        {
            if(intVal % 2 == 0)
            {
                return("Even Number");
            }
            else
            {
                return("Odd Number");
            }
        }
    }

}
