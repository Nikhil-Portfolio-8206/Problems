package P_01_Java_Basic_Problems;
import java.util.Scanner;
public class p01_Add_digit_to_last_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int add_digit=sc.nextInt();
        N=N*10+add_digit;
        System.out.println(N);
    }
}
