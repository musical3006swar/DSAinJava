    
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(n, k, res, new ArrayList<>(),1);
        return(res);
    }
    void backtrack(int n,int k, List<List<Integer>>res, ArrayList<Integer>subList,int start ){
        if(subList.size()==k){
            res.add(new ArrayList<>(subList));
            return;
        }
        for(int i=start;i<=n;i++){
            subList.add(i);
            backtrack(n,k,res,subList,i+1);
            subList.remove(subList.size()-1);
        }
    } 
}