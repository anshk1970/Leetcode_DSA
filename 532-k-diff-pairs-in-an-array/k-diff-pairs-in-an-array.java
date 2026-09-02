class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        HashSet<Integer> visited = new HashSet<>();
        HashSet<String> uniquePairs = new HashSet<>();
        for (int num : nums) {
            if (visited.contains(num - k)) {
                uniquePairs.add((num - k) + "," + num);
            }
            if (visited.contains(num + k)) {
                uniquePairs.add(num + "," + (num + k));
            }
            visited.add(num);
        }
        return uniquePairs.size(); 
    }
}