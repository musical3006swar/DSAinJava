class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }   
        int max=0; 
        for(Map.Entry<Integer,Integer> y: hm.entrySet()){
            max=Math.max(max,y.getValue());
        }
        int res=0;
        for(Map.Entry<Integer,Integer> y: hm.entrySet()){
            if(y.getValue()==max){
                res+=max;
            }
        }
        return res;
    }
}