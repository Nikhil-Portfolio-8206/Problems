package P_02_Functions_String_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class p_09_countOfpairInArray {
    public static int solve(ArrayList<Integer> A, int B) {
        int count=0;
        for(int i=0;i<A.size();i++){
            for(int j=i+1;j<A.size();j++){
                if((A.get(i)+A.get(j))==B){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> A=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            A.add(sc.nextInt());
        }
        int B=sc.nextInt();
        int pair=solve(A,B);
        System.out.print(pair);
    }
}
