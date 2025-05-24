package P_02_Functions_String_Arrays;

import java.util.Scanner;

public class p_13_Print2DArrayInTransformation {
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
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
}
