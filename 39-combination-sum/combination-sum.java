class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        find(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    public void find(int idx,int target,int[] cand, List<List<Integer>> ans, List<Integer> arr){
        if(idx==cand.length){
            if(target==0){
                ans.add(new ArrayList<>(arr));
            }
            return;
        }
        if(cand[idx]<=target){
            arr.add(cand[idx]);
            find( idx, target - cand[idx] , cand, ans, arr);
            arr.remove(arr.size()-1);
        }
        find( idx+1, target , cand, ans, arr);

    }
}