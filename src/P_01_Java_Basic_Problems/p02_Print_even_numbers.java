package P_01_Java_Basic_Problems;

import java.util.*;

public class p02_Print_even_numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        //first way to solve
        for(int i=1;2*i<=N;i++){
            System.out.print(2*i +" ");
        }
        //second way to solve
        /* int i=2;
        while(i<=N){
            System.out.print(i+" ");
            i+=2;
        }*/
    }
}
