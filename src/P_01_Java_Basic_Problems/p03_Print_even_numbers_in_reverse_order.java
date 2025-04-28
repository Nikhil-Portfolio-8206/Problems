package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p03_Print_even_numbers_in_reverse_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Q=N/2;
        for(int i=Q;2*i>=0;i--){
            System.out.print(2*i +" ");
        }

    }
}
