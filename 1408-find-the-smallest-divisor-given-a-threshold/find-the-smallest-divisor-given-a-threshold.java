class Solution {

    private int sumByD(int[] nums, int div) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / div);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
       int n=nums.length;

        // int max=Integer.MIN_VALUE;
        // for(int num:nums){
        //     max=Math.max(max,num);
        // }

        // for(int d=1;d<=max;d++){
        //     int sum=0;
        //     for(int i=0;i<n;i++){
        //         sum += (int)Math.ceil((double)nums[i]/d);
        //     }

        //     if(sum <= threshold){
        //         return d;
        //     }
        // }
        // return -1; 



        if (nums.length > threshold) return -1;

        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sumByD(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}