class Solution:
    # @param grid, a list of lists of integers
    # @return an integer
    def minPathSum(self, grid):
        if not grid:
            return 0
        if  len(grid[0])==0:
            return 0
        row = len(grid)
        col = len(grid[0])
        d = [[0 for c in range(0,col)] for r in range(0,row)]
        
        
        d[0][0]=grid[0][0]
        for c in range(1,col):
            d[0][c]=grid[0][c]+d[0][c-1]
        
        for r in range(1,row):
            d[r][0] = grid[r][0]+d[r-1][0]
        
        for r in range(1,row):
            for c in range(1,col):
                d[r][c]= min(d[r-1][c],d[r][c-1])+grid[r][c]
        
        return d[row-1][col-1]
        
        
