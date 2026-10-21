class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lmaxArr = new int[n];
        int[] rmaxArr = new int[n];
        int lmax=0;
        int rmax=0;
        int total = 0;

        for(int i = 0; i<=n-1; i++) {
            lmax = Math.max(lmax, height[i]);
            lmaxArr[i] = lmax;
        }

        for(int j=n-1; j>=0; j--) {
            rmax = Math.max(rmax, height[j]);
            rmaxArr[j] = rmax;
        }

        for(int i=0; i<n-1; i++) {
            total += Math.min(lmaxArr[i], rmaxArr[i]) - height[i];
        }
        return total;

    }
}
