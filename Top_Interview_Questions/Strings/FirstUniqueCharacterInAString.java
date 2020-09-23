class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        } else {
            for (int i = 0; i < s.length()-1; i++) {
                while (i < s.length()-1 && s.charAt(i) == '0') i++;
              if (s.indexOf(s.charAt(i), i + 1) == -1 && s.charAt(i)!='0') {
                    return i;
                } else {
                    s = s.replaceAll(String.valueOf(s.charAt(i)), "0");
                    
                }
            }
            return -1;
        }
        
    }
}