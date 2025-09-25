class Solution {
    public int maxBalancedShipments(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int count=0;
        st.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(!st.isEmpty() && arr[i]<st.peek()){
                count++;
                st.clear();
                continue;
        
            }
            st.push(arr[i]);
        }
        return count;
    }
}