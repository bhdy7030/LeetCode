public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] dict;
        
        for(int i=0;i<9;i++){
            dict = new int[256];
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num = board[i][j];
                    if(dict[num]==1){
                        return false;
                    }
                    else{
                        dict[num]=1;
                    }
                }
            }
        }
        
         for(int i=0;i<9;i++){
            dict = new int[256];
            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    int num = board[j][i];
                    if(dict[num]==1){
                        return false;
                    }
                    else{
                        dict[num]=1;
                    }
                }
            }
        }
        
       
     
       for(int i=0;i<9;i+=3){
          for(int j=0;j<9;j+=3){ 
            dict = new int[256]; 
              for(int m = 0;m<3;m++){
                  for(int n= 0 ; n< 3; n++){
                      if(board[i+m][j+n]!='.'){
                        int num = board[i+m][j+n];
                        if(dict[num]==1){
                            return false;
                        }
                        else{
                            dict[num]=1;
                        }
                      }
                  }
              }
          
          
         }
       }
        
    return true;
        
    }
}
