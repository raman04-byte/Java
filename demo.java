public class demo
{
    private int day;
    private int month;
    private int year;

    public demo(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;

        System.out.printf("This is a constructor in the demo class %s ", this);
    }

    public String toString()
    {
        return String.format("%d/%d/%d",day,month,year);
    }
}