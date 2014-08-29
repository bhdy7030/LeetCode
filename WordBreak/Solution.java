public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
        if(s==null||dict==null||dict.size()==0) return false;
       // return wordBreaker(s,dict,0);
       
        int len = s.length();
        boolean[] arrays = new boolean[len+1];
        arrays[0] = true;
        for (int i = 1; i <= len; ++i){
          for (int j = 0; j < i; ++j){
            if (arrays[j] && dict.contains(s.substring(j, i))){
              // f(n) = f(0,i) + f(i,j) + f(j,n)
              arrays[i] = true;
              break;
            }
          }
        }
    return arrays[len];
    }
    /**
    public boolean wordBreaker(String s, Set<String> dict, int start){
     if(start==s.length()) return true;
     for(String str:dict){
         int len = str.length();
         int end = start+len;
         if(end>s.length()) continue;
         if(s.substring(start,end).equals(str)){
             if(wordBreaker(s,dict,end)){
                 return true;
             }
            }
     
    }
    return false;
    }   
    
    **/
}
