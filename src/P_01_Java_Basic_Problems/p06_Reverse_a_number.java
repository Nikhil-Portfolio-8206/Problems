package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p06_Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = p08_Reverse_a_number_Helper.reverseNumber(N);
        System.out.print(reverse);
    }
}
