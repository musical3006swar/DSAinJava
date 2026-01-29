class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.toLowerCase();
        if(track(s,0,s.length()-1))return true;
        // System.out.println(s);
        return false;
    }
    public boolean track(String s, int l, int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r))return false;
        return track(s,l+1,r-1);
    }
}