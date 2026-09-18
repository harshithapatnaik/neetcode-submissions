class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> copy = new HashSet<>();
        for (int n: nums){
            if(copy.contains(n))
                return true;
            copy.add(n);
        }
        return false;
    }
}