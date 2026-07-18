class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // एरे को सर्कुलर मानने के लिए 2n-1 तक लूप चलाएं
        for (int i = 2 * n - 1; i >= 0; i--) {
            // Modulo का उपयोग करके इंडेक्स को 0 से n-1 के बीच रखें
            while (st.size() > 0 && st.peek() <= arr[i % n]) {
                st.pop();
            }
            
            // रिजल्ट सिर्फ पहली बार (जब i < n हो) भरें
            if (i < n) {
                if (st.size() == 0) nge[i] = -1;
                else nge[i] = st.peek();
            }
            
            st.push(arr[i % n]);
        }
        
        return nge;
    }
}