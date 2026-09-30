class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Integer max = null;
        Integer smax = null;
        Integer tmax = null;

        for (int i = 0; i < n; i++) {
            if (max == null || nums[i] > max) {
                max = nums[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != max) {
                if (smax == null || nums[i] > smax) {
                    smax = nums[i];
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != max && nums[i] != smax) {
                if (tmax == null || nums[i] > tmax) {
                    tmax = nums[i];
                }
            }
        }

        return (tmax == null) ? max : tmax;

        
              
    }
}