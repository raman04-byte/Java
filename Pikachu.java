import java.util.Scanner;
public class Pikachu {
    public static void main(String[] args) 
    {
        try (// System.out.println("The code is running ");
        Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter name here : ");
            String temp = input.nextLine();
            nitin obj = new nitin();
            obj.setName(temp);
            obj.name();
        }
    }
    
}