class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0; // Handle empty or null array
        }

        int globalMax = nums[0];    // Stores the maximum sum found across the entire array
        int currentMax = nums[0];   // Stores the maximum sum ending at the current position

        for (int i = 1; i < nums.length; i++) {
            // Option 1: Start a new subarray with nums[i]
            // Option 2: Extend the current subarray by adding nums[i]
            // We choose the one that gives a larger sum ending at 'i'
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update the overall maximum sum if the currentMax is greater
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }
}