package P_02_Functions_String_Arrays;

import java.util.Scanner;

public class p_12_2D_Array_printWaveForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        System.out.print("No of rows: ");
        int n = sc.nextInt();
        System.out.print("No of columns: ");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<n; i++){
            if(i%2==0){
                for(int j = 0; j<m; j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
            else{
                for(int j = m-1; j>=0; j--){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
