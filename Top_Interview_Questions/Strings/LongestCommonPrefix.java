class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < strs[0].length(); k++) {
            for (int j = 1; j < strs.length; j++) {
                if (k == strs[j].length() || strs[0].charAt(k) != strs[j].charAt(k))
                    return sb.toString();
            }
            sb.append(strs[0].charAt(k));
        }
        return sb.toString();
        
    }
}