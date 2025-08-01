class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character> x=new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int count=0,maxCount=0;
        for(int i=0;i<k;i++){
            if(x.contains(s.charAt(i))){
                count++;
            }
        }
        maxCount=count;
        for(int i=k;i<s.length();i++){
            if(x.contains(s.charAt(i))){
                count++;
            }
            if(x.contains(s.charAt(i-k))){
                count--;
            }
            maxCount=Math.max(count,maxCount);
        }
        return maxCount;
    }
}
