// https://leetcode.com/contest/weekly-contest-255/problems/find-greatest-common-divisor-of-array/
package pl.puszczynski;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinaryString {

    public String findDifferentBinaryString(String[] nums) {

        Set<String> uniqueSet = new HashSet<>(Arrays.asList(nums));
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<nums.length; i++) {
            sb = new StringBuilder(nums[i]);

            for (int j=0; j<sb.length(); j++) {
                sb.setCharAt(j, sb.charAt(j) == '0' ? '1' : '0');
                if (! uniqueSet.contains(sb.toString())) return sb.toString();
            }
        }
        return sb.toString();
    }
}
