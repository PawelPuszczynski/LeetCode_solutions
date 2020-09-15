class Solution {
    public int removeDuplicates(int[] nums) {
        
        int result = 0;
        for (int i = 0; i < nums.length-1; i++) {

            int tempPos = i;
            while (nums[i] >= nums[tempPos + 1]) {
                tempPos++;
                if (tempPos == nums.length-1) {
                    return i+1;
                }
            }
            nums[i + 1] = nums[tempPos+1];
            result = i+1;
        }
       return result+1;
        
    }
}