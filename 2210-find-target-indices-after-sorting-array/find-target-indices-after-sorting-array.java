class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // int n=nums.length;
        // Arrays.sort(nums);
        // List<Integer> ans = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) { 
        //     if (nums[i] == target) { 
        //         ans.add(i); 
        //     } 
        // } 
        // return ans;
        
        int smaller=0;
        int equal=0;
        for(int num:nums){
            if(num<target) smaller++;
            else if (num==target) equal++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i=smaller;i<equal+smaller;i++) ans.add(i);
        return ans;
    }
}