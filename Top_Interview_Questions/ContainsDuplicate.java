class Solution {
    public boolean containsDuplicate(int[] nums) {
        
         Set<Integer> copy = new HashSet<>();
        for (int element:nums) {
            copy.add(element);
        }
        return  !(copy.size() == nums.length);
    }
}