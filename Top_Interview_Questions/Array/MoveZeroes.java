class Solution {
    public void moveZeroes(int[] nums) {
        
        int k = 0;
            while ((k < nums.length) && (nums[k] != 0)) {
                k++;
            }
            for (int j = k; j < nums.length; j++) {
                if (nums[j] != 0) {
                    nums[k] = nums[j];
                    nums[j] = 0;
                    k = k + 1;
                }
            }
        
    }
}