import java.util.*;
class SyRectangularWalls{
    public int countRectangularWalls(int[][] grid) 
    {
        int m = grid.length,n = grid[0].length;
        int[][] dp = new int[n][n];
        int res = 0;
        for(int i =0;i < m;i++)
        {
            for(int j =0;j < n;j++)
            {
                if(grid[i][j]!=1){
                    continue;
                }
                for(int k =j+1;k<n;k++){
                    if(grid[i][k]==1)
                    {
                        res+=dp[j][k];
                        dp[j][k]++;
                    }
                }
            }
        }
    return res;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int grid[][] = new int[n][m];
        for(int i=0;i < n;i++)
        {
            for(int j =0;j< m;j++)
            {
                grid[i][j]=sc.nextInt();
            }
        }
        System.out.println(new Solution().countRectangularWalls(grid));
    }
}

