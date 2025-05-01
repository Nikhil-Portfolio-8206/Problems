package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p12_First_last_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=1;i<=T;i++){
            int N=sc.nextInt();
            int last_digit=N%10;
            int first_digit=N;
            while(first_digit>=10){
                first_digit/=10;
            }
            System.out.println(first_digit + " "+ last_digit);

        }
    }
}
