class Solution {

    public int BS(int[] nums,int low,int high,int target){
        if(low > high) return -1;
        int mid=low+(high-low)/2;
        if(nums[mid]==target) return mid;
        else if(target > nums[mid]) return BS(nums,mid+1,high,target);
        return BS(nums,low,mid-1,target); 
    }

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        return BS(nums,low,high,target);
        
       
        
        // int left = 0;
        // int right = nums.length - 1;

        // while(left <= right){
        //     int mid = left + (right - left) / 2;

        //     if(nums[mid] == target){
        //         return mid;
        //     }else if(nums[mid]>target){
        //         right = mid - 1;
        //     }else{
        //         left=mid+1;
        //     }
        // }
        // return -1;
        
    }
}