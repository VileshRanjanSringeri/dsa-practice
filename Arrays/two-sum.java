class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {          // first number
            for (int j = i + 1; j < nums.length; j++) {  // second number
                if (nums[i] + nums[j] == target) {       // check sum
                    return new int[] {i, j};             // return indices
                }
            }
        }
        return new int[] {}; // backup return
    }
}
