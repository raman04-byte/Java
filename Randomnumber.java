import java.util.Random;

public class Randomnumber {
    public static void main(String[] args) {
        Random ran = new Random();
        int number;
        for (int i = 1; i <= 10; i++) {
            number = 1 + ran.nextInt(6);
            System.out.println(number);
        }
    }
}