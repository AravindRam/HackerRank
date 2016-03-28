package hackerrank.algorithms.warmup;

import java.util.Scanner;

/*
Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12

Sample Output

15

Explanation

The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10

Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15

*/

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int sum1 = 0 , sum2 = 0;
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n ; j++){
                if(i==j){
                  sum1+=a[i][j];   
                }
                if((i+j) == n-1){
                    sum2+=a[i][j];
                }
            }
        }
        
        if(sum1>sum2){
             System.out.println(sum1-sum2);
         }   
         else{
             System.out.println(sum2-sum1);
         } 
         
         in.close();
    }
}