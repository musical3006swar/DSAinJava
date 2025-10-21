class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer=new ArrayList<>();
        find(answer, new String(), 0, 0, n);
        return answer;
    }
    public void find(List<String> answer, String str, int open, int close, int n){
        if(open==n && close==n){
            if(!answer.contains(str)){
                answer.add(str);
            }
            return;
        }
        if(open<n){
            find(answer, str+'(', open+1, close,n);
        }if(close<open){
            find(answer, str+')', open, close+1,n);
        }
    }
}