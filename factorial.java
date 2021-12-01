import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number you want to calculate factorial");
        try (Scanner sc = new Scanner(System.in)) {
            int a= sc.nextInt();
            int result = 1;
            
            for (int i = a; i >= 1; i--) {
                result = result*i;
            }
            System.out.println(result);
        }
    }
}
