/*
Time Complexity: O(n)
Space Complexity: O(n)
Leetcode: Success
Problem: Had a few issues with the for loop
*/


class Solution {
    public int rob(int[] nums) {
        // Sanity Check
        if(nums==null || nums.length == 0){return 0;}
        
        // Initialize the rows and columns for the 2D matrix
        int n = nums.length;
        int m = 2;
        
        // Initialize the 2D matrix
        int [][] dp = new int [n][m];
        
        // Initialize the 2D matrix's row
        dp[0][0] = nums[0];
        dp[0][1] = 0;
        
        // loop through the array of n elements
        for(int i=1; i<n ; i++){ //C:0 DC : 1
            for(int j=0; j<m; j++){
                // check if the don't chose value is at the beginning row.
                if(j==0){
                    dp[i][j] = nums[i]+ dp[i-1][1];
                }else{
                    // check max of the chose and don't chose value of the previous row
                    dp[i][j] = Math.max(dp[i-1][0], dp[i-1][1]);
                }
            }
        }
        // return the max value at the end. 
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}
