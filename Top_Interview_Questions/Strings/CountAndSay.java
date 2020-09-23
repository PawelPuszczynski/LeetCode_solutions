class Solution {
    public String countAndSay(int n) {
        
        String result = "1";
        StringBuilder sb = new StringBuilder();
        for (int i = n; n > 1; n--) {

            for (int j = 0; j < result.length(); j++) {
                int count = 1;
                while (j < result.length() - 1 && result.charAt(j) == result.charAt(j + 1)) {
                    count++;
                    j++;
                }
                sb.append(count);
                sb.append(result.charAt(j));

            }
            result = sb.toString();
  
            sb = new StringBuilder();
        }
        return result;
        
    }
}