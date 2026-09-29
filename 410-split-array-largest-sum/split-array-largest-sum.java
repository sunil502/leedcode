class Solution {
    private int countStudent(int[] nums,int pages){
        int student=1;
        long pagesStudent=0;
        for(int i=0;i<nums.length;i++){
            if(pagesStudent + nums[i] <= pages){
                pagesStudent += nums[i];
            }else{
                student++;
                pagesStudent = nums[i];
            }
        }
        return student;
    }

    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        if(k>n) return -1;
        int low=0;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high += nums[i];
        }

        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(countStudent(nums,mid) <= k){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}