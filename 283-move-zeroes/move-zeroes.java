class Solution {

    public void moveZeroes(int[] nums) {
        Queue<Integer> st= new LinkedList<>();
        int cntZ=0;;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                st.offer(nums[i]);
            }else{
                cntZ++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(st.size()==0){
                nums[i]=0;
            }
            if(st.size()!=0){
                nums[i]=st.poll();
            }
            
        }
       // return nums;
    }
}