class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        HashSet<Integer> hs= new HashSet<>();
        for(int ele: nums1){
            hs.add(ele);
        }
        for(int ele:nums2){
            if(!hs.isEmpty() && hs.contains(ele)){
                arr.add(ele);
                hs.remove(ele);
            }
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}