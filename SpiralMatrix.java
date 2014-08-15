public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(matrix ==null||matrix.length==0) return list;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        //current position
        int x=0;
        int y=0;
        
        while(m>0&n>0){
            
            //how the stupid thing ends.
            if(m==1){
                for(int i=0;i<n;i++){
                    list.add(matrix[x][y++]);
                }
            break;
            }
            if(n==1){
                
                 for(int i=0;i<m;i++){
                    list.add(matrix[x++][y]);
                }
                break;
            }
            
            
            //->right, n-1 steps
            for(int i=0;i<n-1;i++){
                    list.add(matrix[x][y++]);
            }
            
            //->down, m-1 steps
            for(int i=0;i<m-1;i++){
                list.add(matrix[x++][y]);
            }
            
            //->left, n-1 steps
            for(int i=0; i<n-1;i++){
                list.add(matrix[x][y--]);
            }
            
            //->up, m-1 steps
            for(int i=0;i<m-1;i++){
                list.add(matrix[x--][y]);
            }
            
            //four direction completes
            m-=2;
            n-=2;
            x++;
            y++;
            
            
        }
        
        return list;
    }
}