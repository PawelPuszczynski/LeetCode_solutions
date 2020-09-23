class Solution {
    public int reverse(int x) {
        
        boolean isNegative = x < 0;
        String value = String.valueOf(x);
        if (isNegative) value = value.substring(1);

        for (int i = 0; i < value.length() / 2; i++) {

            char tempLast = value.charAt(value.length() - 1 - i);
            char tempFirst = value.charAt(i);

            value = value.substring(0, i) + tempLast
                    + value.substring(i + 1, value.length() - 1 - i) + tempFirst
                    + value.substring(value.length() - i);
        }

        if (isNegative) value = "-" + value;
        long result = Long.parseLong(value);
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            return Integer.parseInt(value);
        }
        
    }
}