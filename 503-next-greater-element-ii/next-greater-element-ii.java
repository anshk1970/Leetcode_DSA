class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr[i % n]) {
                st.pop();
            }
            if (i < n) {
                if (st.size() == 0) nge[i] = -1;
                else nge[i] = st.peek();
            }
            
            st.push(arr[i % n]);
        }
        return nge;
    }
}