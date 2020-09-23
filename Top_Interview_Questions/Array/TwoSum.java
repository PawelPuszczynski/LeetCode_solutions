class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] solution = new int[2];

        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if ((nums[i] + nums[j]) == target) {
                    solution = new int[]{j, i};
                }
            }
        }
        return solution;
        
    }
}