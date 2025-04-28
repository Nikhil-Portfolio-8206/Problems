package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p04_print_count_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int count=0;
        while(N>0){
            int last_digit=N%10;
            N=N/10;
            count++;
        }
        System.out.print(count);
    }
}
