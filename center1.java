import java.util.Random;

public class center1 {
    public static void main(String[] args) 
    {
        Random ran = new Random();
        int freq[] = new int[7];
        for (int roll_no = 0; roll_no < 1000; roll_no++) {
            ++freq[1 + ran.nextInt(6)];
        }
        System.out.println("face\tfrequency");
        for (int face = 0; face < freq.length; face++) {
            System.out.println(face + "\t" + freq[face]);
        }
    }
}
