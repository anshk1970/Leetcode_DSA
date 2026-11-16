class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int[] freq = new int[101];
        for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }
        result[0] = findXthNegative(freq, x);
        for (int i = k; i < n; i++) {
            freq[nums[i - k] + 50]--;
            freq[nums[i] + 50]++;
            result[i - k + 1] = findXthNegative(freq, x);
        }
        return result;
    }
    private int findXthNegative(int[] freq, int x) {
        int count = 0;
        for (int i = 0; i < 50; i++) {
            count += freq[i];
            if (count >= x) {
                return i - 50; 
            }
        }
        return 0; 
    }
}