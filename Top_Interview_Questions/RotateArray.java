class Solution {
    public void rotate(int[] nums, int k) {
        
        for (; k > 0; k--) {

            int tempLast = nums[nums.length - 1];

            for (int j = nums.length -1 ; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tempLast;
        }
        
    }
}