package P_01_Java_Basic_Problems;

import java.util.Scanner;

public class p14_Armstrog_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int original=N;
        int sum=0;
        for(int i=1;i<=N;i++){
            while(N>0){
                int last_digit=N%10;
                sum=sum+( last_digit*last_digit*last_digit );
                N/=10;
            }
            if(sum==original){
                System.out.print("YES");
            }
            else{
                System.out.print("NO");
            }
        }
    }
}
