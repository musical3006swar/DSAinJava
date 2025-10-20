class Solution {
    public long maximumSumOfHeights(int[] heights) {
        long ans = 0;
        int n=heights.length;
    for (int maxIdx = 0; maxIdx < n; maxIdx++) {
        int[] copy = heights.clone(); 
        //right
        Stack<Integer> st =new Stack<>();
        for(int i=maxIdx;i>=0;i--){
            while(!st.isEmpty() && st.peek()>copy[i]){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()<copy[i]){
                copy[i]=st.peek();
            }
            st.push(copy[i]);
        }
        //left
        st.clear();
            for(int i=maxIdx;i<n;i++){
                while(!st.isEmpty() && st.peek()>copy[i]){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()<copy[i]){
                    copy[i]=st.peek();
                }
                st.push(copy[i]);
            }
            long res=0;
            for(int i=0;i<n;i++){
                res+=copy[i];
            }
            ans = Math.max(ans,res);
        }
        return ans;
    }
}


