package P_02_Functions_String_Arrays;

import java.util.Scanner;

public class p_11_ReverseInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        System.out.print("Enter the first index: ");
        int first = input.nextInt();
        System.out.print("Enter the second index: ");
        int second = input.nextInt();
        int start=first,end=second;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
