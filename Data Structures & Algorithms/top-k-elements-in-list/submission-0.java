class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> setCount = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        int[] result = new int[k];
        int index = 0;

        for(int i : nums) {
            setCount.put(i, setCount.getOrDefault(i,0) + 1);
        }

        for(int i=0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }
        for(HashMap.Entry<Integer, Integer> freqCount : setCount.entrySet()) {
            freq[freqCount.getValue()].add(freqCount.getKey());
        }

        for(int i = freq.length - 1; i > 0 && index < k ; i--) {
            if(freq[i] != null) {
                for(int j : freq[i]) {
                    result[index] = j;
                    index++;
                    if(index == k)
                        return result;

                }
            }

        }
        return result;


    }
}


// setCount: {(num, freq), (num, freq),...}
// freq: {[],[a,b,c,..],...,[x,y,..],[],[]}
