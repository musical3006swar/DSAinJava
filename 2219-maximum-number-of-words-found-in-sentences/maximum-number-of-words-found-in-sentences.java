class Solution {
    public int mostWordsFound(String[] sentences) {
        int len=0,maxLen=0;
        for(String what: sentences){
            String[] str= what.split("\\s+");
            len=str.length;
            maxLen=Math.max(len,maxLen);
        }
        return maxLen;
    }
}