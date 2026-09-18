class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        copy = set()
        for n in nums:
            if n in copy:
                return True
            copy.add(n)
        return False