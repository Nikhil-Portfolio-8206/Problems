package P_02_Functions_String_Arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
public class p_05_IsArraylistAlphaNum_check {
    public static int solve(ArrayList<Character> A) {
        int n = A.size();
        for(int i=0;i<n;i++){
            char ch=A.get(i);
            if  (!((ch >= 'A' && ch <= 'Z') ||
                    (ch >= 'a' && ch <= 'z') ||
                    (ch >= '0' && ch <= '9'))) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // number of characters to read
        sc.nextLine(); // consume newline after int input
        ArrayList<Character> A = new ArrayList<>();

        System.out.println("Enter " + N + " characters (one per line):");
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            if (line.length() > 0) {
                A.add(line.charAt(0)); // take first character of the line
            } else {
                i--; // empty input, ask again
            }
        }
        p_05_IsArraylistAlphaNum_check obj = new p_05_IsArraylistAlphaNum_check();
        int result = obj.solve(A);
        System.out.println(result);
    }
}
