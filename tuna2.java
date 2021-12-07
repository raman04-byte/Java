public class tuna2 
{
    private int date;
    private int month;
    private int year;
    
    public tuna2(int d, int m, int y)
    {
        date = d;
        month = m;
        year = y;

        System.out.printf("The date , month, year are %s \n",this);
    }
    public String toString()
    {
        return String.format("%d/%d/%d", date,month,year);
    }
}
