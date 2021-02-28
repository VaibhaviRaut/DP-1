class Solution {
    public int rob(int[] nums) {
        if(nums==null || nums.length == 0){return 0;}
        
        int n = nums.length;
        int m = 2;
        int [][] dp = new int [n][m];
        dp[0][0] = nums[0];
        dp[0][1] = 0;
        
        for(int i=1; i<n ; i++){ //C:0 DC : 1
            for(int j=0; j<m; j++){
                if(j==0){
                    dp[i][j] = nums[i]+ dp[i-1][1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][0], dp[i-1][1]);
                }
            }
        }
        return Math.max(dp[n-1][0],dp[n-1][1]);
    }
}
