public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid==null) return 0;
        int m = obstacleGrid.length;
        if(m==0) return 0;
        int n = obstacleGrid[0].length;
       
        if(n==1){
           for(int i=0; i<m;i++){
            if(obstacleGrid[i][0]==1){
                return 0;
                
             }
           }
             return 1;
        
        }
        
        int[][] mem = new int[m][n];
        boolean obs = false;
        for(int i=0;i<m;i++){
            if(obstacleGrid[i][0]==1){
             obs = true;
            }
            if(!obs){
                mem[i][0] = 1;
            }
            else{
                mem[i][0] = 0;
            }
            
        }
        obs = false;
        for(int i=0;i<n;i++){
            if(obstacleGrid[0][i]==1){
             obs = true;
            }
            if(!obs){
                mem[0][i] = 1;
            }
            else{
                mem[0][i] = 0;
            }
            
        }
        
        obs = false;
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                
                if(obstacleGrid[i][j]==1){
                    mem[i][j]=0;
                }
                else{
                    mem[i][j]=mem[i-1][j]+mem[i][j-1];
                }
                
                
            }
            
        }
        
        return mem[m-1][n-1];
        
        
        
    }
}
