class Solution {

    public int kadSum(int arr[]){
        int n=arr.length;
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum += arr[i];
            maxSum =Math.max(currSum,maxSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int normalSum=kadSum(nums);
        int numsRev=0;
        for(int i=0;i<n;i++){
            numsRev += nums[i];
            nums[i] *= -1;
        }
        int newKad=kadSum(nums);
        if(numsRev+newKad == 0) return normalSum;

        return Math.max((numsRev+newKad),normalSum);
    }
}