class Solution {
    public boolean isValidSudoku(char[][] board) {

        int height = board.length;
        int width = board[0].length;

//        char Array to List <Integer>
        List<Integer> intArrList = new ArrayList<>();
        for (char[] chars : board) {
            for (char aChar : chars) {
                intArrList.add(((aChar == '.' ? 0 :
                        Character.getNumericValue(aChar))));
            }
        }

//        HORIZONTAL line check
        for (int k = 0; k < width * height; k += width) {
            for (int i = k; i < k + width; i++) {
                for (int j = i + 1; j < (k + width); j++) {
                    if (intArrList.get(j) != 0 && intArrList.get(i).equals(intArrList.get(j))) {
                        return false;
                    }

                }
            }
        }
//        VERTICAL line check
        for (int k = 0; k < width * height; k += width) {
            for (int i = k; i < k + width; i++) {
                for (int j = i + width; j < height * width; j += width) {
                    if (intArrList.get(j) != 0 && intArrList.get(i).equals(intArrList.get(j))) {
                        return false;
                    }
                }
            }
        }

//      3x3  check
        Set<Integer> setInt = new HashSet<>();
        int currentVal = 0;
        for (int l = 0; l < height * width; l += width * 3) {
            for (int k = 0; k < width; k += 3) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        currentVal = intArrList.get((i * width) + j + k + l);
                        if (currentVal != 0 && !setInt.add(currentVal)) return false;
                    }
                }
                setInt.clear();
            }
        }
        return true;

    }
}