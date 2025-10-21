class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] nge=new int[n];
        Stack<Integer> st =new Stack<>();
        st.push(0);
        for(int i=2*n-1;i>=0;i--){
            int j=i%n;
            while(!st.isEmpty() && nums[st.peek()]<=nums[j]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty() && nums[st.peek()]>nums[j]){
                    nge[j]=nums[st.peek()];
                }else if(st.isEmpty()){
                    nge[j]=-1;
                }
            }
            st.push(j);
        }
        return nge;
    }
}