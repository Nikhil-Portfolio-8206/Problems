package P_02_Functions_String_Arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class p_07_isNumberPresentinArray {
    public static int solve(ArrayList<Integer> A, int B) {
        if (A == null || A.size() == 0) return 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B) {
                return 1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }
        int B=sc.nextInt();
        System.out.println(solve(A, B));
    }
}


