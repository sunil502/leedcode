class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int minIndex=-1;
        int maxIndex=-1;
        int skip=-1;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK) skip=i;
            if(nums[i]==minK) minIndex=i;
            if(nums[i]==maxK) maxIndex=i;  
            ans += Math.max(0L,Math.min(minIndex,maxIndex)-skip);
        }
        return ans;
    }
}