class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> arrL=new ArrayList<>();
        List<Integer> og=new ArrayList<>();
        for(int num:nums)og.add(num);
        find(arrL, new ArrayList<>(), og, nums.length);
        return arrL;
    }
    public void find(List<List<Integer>> arrL, List<Integer> arr, List<Integer> og, int len){
        if(arr.size()==len){
            if(!arrL.contains(arr)){
                arrL.add(arr);
            }
            return;
        }
        for(int i=0;i<og.size();i++){
            List<Integer> newArr=new ArrayList<>(arr);
            newArr.add(og.get(i));
            List<Integer> newOg=new ArrayList<>(og);
            newOg.remove(i);
            find(arrL, newArr, newOg, len);
        }
    }
}