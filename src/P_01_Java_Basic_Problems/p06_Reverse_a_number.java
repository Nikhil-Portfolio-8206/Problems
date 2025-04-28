package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p06_Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int reverse=0;
        int temp=N;
        if(N<0){
            N=N*(-1);
        }
        while(N>0){
            int last_digit=N%10;
            reverse=reverse*10+last_digit;
            N=N/10;

        }
        if(temp<0){
            reverse=reverse*(-1);
        }
        System.out.print(reverse);
    }
}
