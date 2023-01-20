public class Date
{
    static int monthDays1[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int monthDays2[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static int checkLeapYears(int y)
    {
        if (y % 4 == 0)
        {
            if (y % 100 == 0)
            {
                if (y % 400 == 0)
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
            else
            {
                return 1;
            }
        }
        else
        {
            return 0;
        }
    }
    static int countofDays(int d, int m, int y)
    {
        int days = 0;
        for(int i=2000; i<=y; i++)
        {
            if(checkLeapYears(i)==1)
            {
                if(i<y)
                {
                    days=days+366;
                }
                else
                {
                    for(int j=0; j<m-1; j++)
                    {
                        days=days+monthDays2[j];
                    }
                }

            }
            else
            {
                if(i<y)
                {
                    days=days+365;
                }
                else
                {
                    for(int j=0; j<m-1; j++)
                    {
                        days=days+monthDays1[j];
                    }
                }
            }
        }
        days=days+(d-1);
        return days;
    }
    public static void main(String[] args)
    {
        int d=Integer.parseInt(args[0]);
        int m=Integer.parseInt(args[1]);
        int y=Integer.parseInt(args[2]);
        System.out.println("No. of days are " +countofDays(d,m,y));
    }
}
