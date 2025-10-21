class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arrL=new ArrayList<>();
        List<Integer> og=new ArrayList<>();
        for(int num:nums)og.add(num);
        int n=nums.length;
        find(arrL, new ArrayList<>(), og, n, 0);
        return arrL;
    }
    public void find( List<List<Integer>> arrL, List<Integer> arr, List<Integer> og, int len, int i){
        if(arr.size()==len){
            if(!arrL.contains(arr))arrL.add(arr);
            return;
        }
        for (int j = 0; j < og.size(); j++) {
            List<Integer> newArr=new ArrayList<>(arr);
            newArr.add(og.get(j));

            List<Integer> newOg=new ArrayList<>(og);
            newOg.remove(j);

            find(arrL, newArr, newOg, len, 0);
        }
    }
}