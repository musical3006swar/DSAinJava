
class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        // code here
        int[] arr=new int[9];
        for(int i=1;i<=9;i++)arr[i-1]=i;
        List<List<Integer>> ans = new ArrayList<>();
        find(0,n,k,arr,ans,new ArrayList<>());
        return ans;
    }
    public void find(int idx, int target, int size, int[] arr, List<List<Integer>> ans, List<Integer> res ){
        if(target==0 && res.size()==size){
            ans.add(new ArrayList<>(res));
            return;
        }
        if (target<0 || res.size() > size || idx == arr.length) return; 
        
       for (int i=idx; i<arr.length; i++) {
            if (arr[i]>target) break;

            res.add(arr[i]);
            find(i+1, target-arr[i], size, arr, ans, res);
            res.remove(res.size()-1);
        }
    }
}