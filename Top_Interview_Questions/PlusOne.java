class Solution {
    public int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                if (i != 0) {
                    digits[i] = 0;
                } else {
                    int[] newArr = Arrays.copyOf(digits, (digits.length + 1));
                    newArr[0] = 1;
                    return newArr;
                }
            }
        }
        return digits;
        
    }
}