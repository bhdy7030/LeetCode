public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers==null||numbers.length==0) return null;
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i=0;i<numbers.length;i++){
            if(!dict.containsKey(numbers[i])){
                dict.put(target-numbers[i],i+1);
            }
            else{
                res[0]=dict.get(numbers[i]);
                res[1]=i+1;
                return res;
            }
        }
        return res;
    }
}
