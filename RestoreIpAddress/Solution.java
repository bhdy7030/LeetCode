public class Solution {
    public List<String> restoreIpAddresses(String s) {
        
        List<String> res = new ArrayList<String>();
        if(s==null||s.length()<4||s.length()>12) return res;
        dfs(res,"",s,0);
        return res;
    }
    
    public void dfs(List<String> res,String temp, String s,int level){
        if(level == 3 && isValid(s)){
            res.add(temp+s);
            return;
        } 
        for(int i =1;i<4 && i<s.length();i++){
            String substr = s.substring(0,i);
            if(isValid(substr))
                dfs(res,temp+substr+".",s.substring(i),level+1);
        }
  
    }
    
    public boolean isValid(String s){
        if(s.charAt(0)=='0')return s.equals("0");
        int num = Integer.parseInt(s);
        return num>=0 && num<=255;
    }
    
   
}
