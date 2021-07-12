class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> arrList = IntStream.of(nums)
                .boxed()
                .sorted()
                .collect(Collectors
                        .toList());
        var solution = new ArrayList<Integer>();
        int sumSub = 0;
        
        for (int i = arrList.size() - 1; i >= 0; i--) {
            int sumTemp = 0;
            sumSub += arrList.get(i);
            solution.add(arrList.get(i));
            
            for (int j = i - 1; j >= 0; j--) {
                sumTemp += arrList.get(j);
                if (sumTemp > sumSub) break;
            }
            if (sumSub > sumTemp) break;
        }
        return solution;
        
    }
}