import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);
        System.out.println("Enter a number to check a prime or not");
        int n = me.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n%i==0) {
                isPrime = false;
                break;
            }
        }
        if (n < 2) {
            isPrime = false;
        }
        System.out.println("Is Prime " + isPrime);
    }
}
