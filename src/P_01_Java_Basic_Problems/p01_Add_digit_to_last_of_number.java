package P_01_Java_Basic_Problems;
import java.util.Scanner;
public class p01_Add_digit_to_last_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int add_digit=sc.nextInt();
        int no_of_digits=add_digit;
        int count=0;
        while(no_of_digits>0){
            int last_digit=no_of_digits%10;
            no_of_digits/=10;
            count++;
        }
        if(count>=2){
            System.out.println("Please enter a valid digit");
        }
        else {
            N=N*10+add_digit;
            System.out.println(N);
        }
    }
}
