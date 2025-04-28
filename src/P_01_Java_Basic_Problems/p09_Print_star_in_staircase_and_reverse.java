package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p09_Print_star_in_staircase_and_reverse {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int N=sc.nextInt();
            //reverse staircase
            for(int i=N;i>0;i--){
                for(int j=1;j<=i;j++){             //Easier way to print in reverse just change j<=N+1-i
                    System.out.print("*");
                }
                System.out.println();
            }

            //Staircase printing start
               /* for(int i=1;i<=N;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }*/
        }
}
