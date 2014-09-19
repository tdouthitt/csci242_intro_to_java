

public class Month
{
    public Month(int yMonth)
    {
        month = yMonth; 
    }
    public int days()
    {
        int days;
        if(month == 4 || month == 6 || month == 9 || month == 11)
            days = 30;
        else if(month == 2)
            days = 28;
        else if(month >= 1 && month <= 12)
            days = 31;
        else
            days = 0;
            
            return days;
    }
    private int month;
}