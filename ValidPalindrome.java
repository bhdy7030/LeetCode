public class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return false;
        if(s.length()==0) return true;
        
        int i=0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            char head = arr[i];
            while(i<s.length()-1&&!isNum(head)&&!isAlpha(head)){
                i++;
                head = arr[i];
            }
            
            char tail = s.charAt(j);
            while(j>0&&!isNum(tail)&&!isAlpha(tail)){
                j--;
                tail = arr[j];
            }
            
            if(i>=j){
                 break;
            }
            
                
            if(!isSame(head,tail)){
                return false;
            };
            
            
            i++;
            j--;
            
        }
        return true;
        
    }
    
    public boolean isNum(char c){
        
        if(c>='0'&&c<='9'){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isAlpha(char c){
        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isSame(char a,char b){
        if(isNum(a)&&isNum(b)){
            return a==b;
        }
        else{
            if(isAlpha(a)&&isAlpha(b)){
                return Character.toUpperCase(a)==Character.toUpperCase(b);
            }
            else{
                return false;
            }
            
        }
        
        
    }
    

}
