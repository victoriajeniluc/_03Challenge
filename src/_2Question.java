/**
 * Print the table of 12 using while loop.
 * Output should be in following format:
 * 12 X 1 = 12
 * 12 X 2 = 24
 * 12 X 3 = 36
 * 12 X 4 = 48
 * 12 X 5 = 60
 * 12 X 6 = 72
 * 12 X 7 = 84
 * 12 X 8 = 96
 * 12 X 9 = 108
 * 12 X 10 = 120
 */
public class _2Question {
    public static void main(String[] args) {
        int num = 0;
        int end = 10;
        while(num++ < end) {
            int product = 12 * num;
            System.out.println("12 x " + num + " = " + product);
        }
    }
}
