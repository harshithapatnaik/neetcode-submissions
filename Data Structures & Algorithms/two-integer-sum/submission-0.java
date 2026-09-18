class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> differenceSet = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(differenceSet.containsKey(diff)) {
                return new int[] {differenceSet.get(diff), i};
            }
            differenceSet.put(nums[i], i);
        }
        return new int[] {};
    }
}
