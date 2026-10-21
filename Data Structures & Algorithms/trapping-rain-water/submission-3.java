class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int l=0;
        int r=n-1;
        int lmax=height[l];
        int rmax=height[r];

        while(l<r) {
            lmax = Math.max(lmax, height[l]);
            rmax = Math.max(rmax, height[r]);
            if(lmax <= rmax) {
                total += Math.min(lmax,rmax) - height[l];
                l++;
            } else {
                total += Math.min(lmax,rmax) - height[r];
                r--;
            }
        }
        return total;

    }
}
