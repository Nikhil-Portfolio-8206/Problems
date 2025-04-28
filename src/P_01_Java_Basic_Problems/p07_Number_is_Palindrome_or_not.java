package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p07_Number_is_Palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int reverse = p08_Reverse_a_number_Helper.reverseNumber(N);
        if(reverse==N){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
