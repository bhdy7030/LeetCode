import java.util.ArrayList;
import java.util.List;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> res = new ArrayList<List<String>>();


        dfs(res,0,n,new int[n]);
        return res;

    }

    public void dfs(List<List<String>> res, int currentLevel, int n, int[] position){

        if(currentLevel==n){
            generateBoard(res,position,n);
        }
        else{

            for(int i=0;i<n;i++){
                position[currentLevel]=i;
                if(isValid(position,currentLevel)){

                    dfs(res,currentLevel+1,n,position);
                }

            }


        }


    }

    public boolean isValid(int[] position, int current){

        for(int i=0;i<current;i++){

            if(position[i]==position[current]||Math.abs(position[i]-position[current])==(current-i)){
                return false;
            }

        }
        return true;

    }


    public void generateBoard(List<List<String>> res,int[] position,int n){

        ArrayList<String> bStrings = new ArrayList<String>();
        for(int i=0;i<n;i++){

            StringBuilder row = new StringBuilder();
            for(int j=0;j<n;j++){

                if(j==position[i]) row.append("Q");
                else row.append(".");

            }
            bStrings.add(row.toString());

        }

        res.add(bStrings);


    }

    public static void main(String[] args){

        NQueens nQueens = new NQueens();
        List<List<String>> res = nQueens.solveNQueens(8);
        for(List<String> s : res){

            for(String str:s){

                System.out.println(str);
            }
            System.out.println();

        }

    }


}
