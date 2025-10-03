class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        find(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    public void find(List<List<Integer>> ans,List<Integer> res,int[] nums,int pro){
        ans.add(new ArrayList<>(res));
        for(int i=pro;i<nums.length;i++){
            if(i>pro && nums[i]==nums[i-1])continue;
            res.add(nums[i]);
            find(ans,res,nums,i+1);
            res.remove(res.size()-1);
        }
    }
}