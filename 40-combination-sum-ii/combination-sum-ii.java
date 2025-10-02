class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        find(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
    public void find(int idx,int target,int[] cand, List<List<Integer>> ans, List<Integer> arr){
        if(target==0){
                ans.add(new ArrayList<>(arr));
                return;
        }
        for(int i=idx;i<cand.length;i++){
            if(i>idx && cand[i]==cand[i-1])continue;
            if(cand[i]>target)break;
            arr.add(cand[i]);
            find( i+1, target - cand[i] , cand, ans, arr);
            arr.remove(arr.size()-1);
        }
    }
}