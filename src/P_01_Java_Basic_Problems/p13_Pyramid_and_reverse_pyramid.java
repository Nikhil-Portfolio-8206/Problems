package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p13_Pyramid_and_reverse_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        // Pyramid pattern
        /*for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


        //reverse Pyramid pattern
        for(int i=0;i<N;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*(N-i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
