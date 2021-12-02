public class Enhanced {
    public static void main(String[] args) {
        int array[] = { 1, 23, 4, 5, 6, 6, 7, 78, 56, 45, 3, 3 };
        int total = 0;
        for (int x : array) {
            total += x;
        }
        System.out.println(total);
    }
}