class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for (int w : weights) {
            low = Math.max(low, w); // Minimum capacity must be at least the heaviest package
            high += w;             // Maximum capacity is the sum of all packages
        }
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(weights, days, mid)) {
                ans = mid;          // Record valid capacity
                high = mid - 1;     // Try to find a smaller valid capacity
            } else {
                low = mid + 1;      // Capacity too small, increase it
            }
        }
        return ans;
    }
    private boolean isPossible(int[] weights, int days, int capacity) {
        int currentDays = 1;
        int currentLoad = 0;
        for (int w : weights) {
            if (currentLoad + w > capacity) {
                currentDays++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return currentDays <= days;
    }
}