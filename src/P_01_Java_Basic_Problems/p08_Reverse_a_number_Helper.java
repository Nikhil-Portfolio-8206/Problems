package P_01_Java_Basic_Problems;

public class p08_Reverse_a_number_Helper {
    public static int reverseNumber(int N) {
        int reverse = 0;
        int temp = N;
        if (N < 0) {
            N = N * (-1);
        }
        while (N > 0) {
            int last_digit = N % 10;
            reverse = reverse * 10 + last_digit;
            N = N / 10;
        }
        if (temp < 0) {
            reverse = reverse * (-1);
        }
        return reverse;
    }
}
