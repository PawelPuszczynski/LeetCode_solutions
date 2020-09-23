import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public int myAtoi(String str) {
       
       
        Pattern pattern2 = Pattern.compile("^[\\s]*([-]??|[+]??)[\\d]+");
        Matcher matcher2 = pattern2.matcher(str);
        String m2;

        try {
            matcher2.find();
            m2 = matcher2.group();
        } catch (IllegalStateException e) {
            return 0;
        }

        m2 = m2.strip().replaceAll("[+]", "");

        int result = 0;
        
        try {
            result = Integer.parseInt(m2);
        } catch (NumberFormatException e) {
            if (m2.contains("-")) return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }

        return result;
    }
}