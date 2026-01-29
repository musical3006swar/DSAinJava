class Solution {
    public void reverseString(char[] s) {
        track(s,0,s.length-1);
    }
    public void track(char[] s,int l,int r){
        if(l>=r)return;

        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        track(s,l+1,r-1);
    }
}