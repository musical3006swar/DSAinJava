class Solution {
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        int[] leftSmall=new int[n];
        leftSmall[0]=0;st.add(0);
        for (int i=0; i<n; i++) {
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                st.pop();
            } 
            if (st.isEmpty()) leftSmall[i] = 0;
            else leftSmall[i] = st.peek()+1;
                st.push(i);
        }
        st.clear();
        int[] rightSmall=new int[n];
        rightSmall[n-1]=n-1;st.add(n-1);
        for (int i=n-1; i>=0; i--) {
            while (!st.isEmpty() && arr[st.peek()]>=arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) rightSmall[i] = n-1;
            else rightSmall[i] = st.peek()-1;
                st.push(i);
        }
      
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]*(rightSmall[i]-leftSmall[i]+1));
        }
        return max;
    }
}