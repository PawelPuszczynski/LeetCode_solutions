class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int[] shorterArr;
        int[] longerArr;

        if (nums1.length >= nums2.length) {
            shorterArr = nums2;
            longerArr = nums1;

        } else {
            shorterArr = nums1;
            longerArr = nums2;
        }

        List<Integer> intList1 = Arrays.stream(shorterArr)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> intList2 = Arrays.stream(longerArr)
                .boxed()
                .collect(Collectors.toList());

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < intList1.size(); i++) {
            for (int j = 0; j < intList2.size(); j++) {

                if (intList1.get(i).equals(intList2.get(j))) {
                    hashMap.put(i, intList1.get(i));
                    intList2.remove(j);
                     break;
                }
            }
        }
        return hashMap.values().stream()
                .mapToInt(Integer::intValue)
                .toArray();
        
    }
}