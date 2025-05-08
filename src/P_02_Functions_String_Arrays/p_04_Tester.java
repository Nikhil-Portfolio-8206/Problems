package P_02_Functions_String_Arrays;

import java.util.Scanner;

public class p_04_Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count= p_02_count_no_of_factor.add(N);
        int countPrimeNo = p_03_Count_prime_no_less_than_N.Count_prime_no(N);
        System.out.println(count);
        System.out.println(countPrimeNo);
    }
}
