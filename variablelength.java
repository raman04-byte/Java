//import java.util.Scanner;
public class variablelength 
{
    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);
        System.out.println("The average of the numbers are : " + average(1,4,53,54,64,45));
    }
    public static int average(int ...numbers) 
    {
        int total = 0;
        for (int x : numbers) {
            total+=x;
        }
        return total/numbers.length;    
    }
}
