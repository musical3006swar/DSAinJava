class Solution {
    public String removeKdigits(String num, int k) {
        int trv = num.length() - k - 1;
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            while (!st.isEmpty() && k > 0 && st.peek() > num.charAt(i)) {
                st.pop();
                k--;
            }
            st.add(num.charAt(i));
        }

        while (k > 0) {
            st.pop();
            k--;
        }

        String str = "";
        while (!st.isEmpty()) {
            str = st.pop() + str;
        }

        int idx = 0;
        while (idx < str.length() && str.charAt(idx) == '0') idx++;
        str = (idx == str.length()) ? "0" : str.substring(idx);

        return str;
    }
}
