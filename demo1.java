public class demo1 {
    private String name;
    private demo birthday;

    public void demo(String theName, demo theDate)
    {
        name = theName;
        birthday = theDate;
    }
    public String toString()
    {
        return String.format("The name of the birthday boy is %s and date is %s",name,birthday);
    }
}
