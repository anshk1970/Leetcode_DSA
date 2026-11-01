class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for (int ele : nums) {
            max = Math.max(max, ele);
        }
        
        int lo = 1, hi = max, speed = max;
        
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (hours(mid, nums) <= threshold) {
                speed = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return speed;
    }

    public long hours(int speed, int[] arr) {
        long threshold = 0;
        for (int ele : arr) {
           threshold += (ele + (long) speed - 1) / speed;
        }
        return threshold;
    }
}