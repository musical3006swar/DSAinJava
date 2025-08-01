class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs= new HashSet<>();
        if(s.length()==1)return 1;
        int cnt=0,i=0,j=0;
        while(i<s.length()){
            
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(j));
                j++;
            }else{
                hs.add(s.charAt(i));
                i++;
            }
            cnt=Math.max(hs.size(),cnt);
        }
        return cnt;
    }
}
