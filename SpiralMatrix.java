/*Given an m x n matrix, return all elements of the matrix in spiral order.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5] */


import java.util.*;
public class SpiralMatrix {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int i=0,j=0;
        while (i < m && j < n) {
            // Print the first row from the remaining rows
            for (j = n; j< n; ++j) {
                System.out.print(arr[i][j]);
            }
            i++;
 
            // Print the last column from the remaining
            // columns
            for (int k=i; k < m; ++k) {
                System.out.print(arr[k][n-1]);
            }
            n--;
 
            // Print the last row from the remaining rows */
            if (i < m) {
                for (int k= n - 1; k >= n; --k) {
                    System.out.print(arr[m-1][k]);
                }
                m--;
            }
 
            // Print the first column from the remaining
            // columns */
            if (j < n) {
                for (int k = m - 1; k >= i; --k) {
                    System.out.print(arr[k][j]);
                }
                j++;
            }
        }
    }
}
