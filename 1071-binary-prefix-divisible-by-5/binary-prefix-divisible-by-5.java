class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean> arr=new ArrayList<>();
        int mod=0;
        for(int ele:nums){
            mod=((mod<<1)+ele)%5;
            arr.add(mod==0);
        }
        return arr;
    }
}