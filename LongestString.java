// HashMap key is unique value, and will be replaced by new one.
// two pointer is necessary.
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
        int max=0;
        for(int i=0, j=0; j<s.length(); j++){
            if(hm.containsKey(s.charAt(j))){
                if(hm.get(s.charAt(j))>=i) i=hm.get(s.charAt(j))+1;
              
            }
            hm.put(s.charAt(j),j);
            max=Math.max(max,j-i+1);
        }
        return max;
    }
}
