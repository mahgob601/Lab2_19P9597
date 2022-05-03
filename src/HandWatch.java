public class HandWatch
{
    public String modify(String changes)
    {
        String state = "NORMAL";
        String state1 = "TIME";
        int m = 0, h = 0, D = 1, M = 1, Y = 2000;
        char[] inputArray = changes.toCharArray();
        String updateState = "min";

        for(char inp: inputArray)
        {
            switch (state)
            {
                case "NORMAL":
                    if(inp == 'c')
                        state = "UPDATE";
                    else if(inp == 'b')
                        state = "ALARM";
                    else if(inp == 'a')
                    {
                        if(state1 == "TIME")
                            state1 = "DATE";
                        else
                            state1 = "TIME";
                    }
                    break;

                case "UPDATE":
                    if(inp == 'd')
                        state = "NORMAL";
                    else if (inp == 'a')
                    {
                        switch (updateState)
                        {
                            case "min":
                                updateState = "hour";
                                break;
                            case "hour":
                                updateState = "day";
                                break;
                            case "day":
                                updateState = "month";
                                break;
                            case "month":
                                updateState = "year";
                                break;
                            case "year":
                                updateState = "month";
                                break;

                        }
                    }
                    else if(inp == 'b')
                    {
                        switch (updateState)
                        {
                            case "min":
                                if((m % 60 == 0) && m != 0)
                                {
                                    h += 1;
                                    m = 0;
                                }
                                else
                                    m += 1;
                                break;
                            case "hour":
                                if((h % 24 == 0) && h != 0)
                                {
                                    D += 1;
                                    h= 0;
                                }
                                else
                                    h += 1;
                                break;

                            case "day":
                                if((D % 31 == 0) && D != 0)
                                {
                                    M += 1;
                                    D = 0;
                                }
                                else
                                    D += 1;
                                break;

                            case "month":
                                if((D % 31 == 0) && D != 0)
                                {
                                    M += 1;
                                    D = 0;
                                }
                                else
                                    D += 1;
                                break;

                        }


                    }


            }
        }
    }
}
