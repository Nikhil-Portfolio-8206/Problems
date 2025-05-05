package P_02_Functions_String_Arrays;

import java.util.Scanner;

public class p_01_Add_two_number {
    static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(add(A, B));
    }
}
