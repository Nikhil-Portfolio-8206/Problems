package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p05_Sum_Of_Odd_Even_Digits_In_A_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;

        while(N>0){
            int last_digit=N%10;
            if(last_digit % 2!=0){
                odd_sum+= last_digit;
            }
            if(last_digit % 2==0){
                even_sum+=last_digit;
            }
            N=N/10;
        }
        System.out.println("Sum of Odd Digit : "+ odd_sum);
        System.out.println("Sum of Even Digit : "+ even_sum);
    }
}
