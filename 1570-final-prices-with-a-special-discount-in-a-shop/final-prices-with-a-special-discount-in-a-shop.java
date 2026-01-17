class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st=new Stack<>();
        int n=prices.length;
        int disc[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
                disc[st.peek()]=prices[st.pop()]-prices[i];
            }
            st.push(i);
        }
        while(!st.isEmpty())disc[st.peek()]=prices[st.pop()];
        return disc;
    }
}