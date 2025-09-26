class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> st =new Stack<>();
        int[] prevSmall=new int[n];
        st.push(n-1);prevSmall[n-1]=0;
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prevSmall[i]=0;
            }else{
                prevSmall[i]=st.peek()-i;
            }
            st.push(i);
        }
        return prevSmall;
    }
}