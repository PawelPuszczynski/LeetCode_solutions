/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if (n == 1) return n;
        int maxIndex = n;
        int lowerBoundIdx = 1;
        int pointer = maxIndex;


        while (true) {
            if (isBadVersion(pointer)) {
                if(!isBadVersion(pointer - 1)) break;
                    if (pointer == 2){
                    pointer = 1;
                    break;
                } else {
                    pointer = pointer - ((pointer - lowerBoundIdx) / 2);
                }
            } else {
                lowerBoundIdx = pointer;
                pointer = maxIndex - ((maxIndex-pointer)/2);

            }
        }
        return pointer ;
    }
}