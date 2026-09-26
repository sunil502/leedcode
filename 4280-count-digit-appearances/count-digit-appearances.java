class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int count=0;
        for(int num : nums){
            if (num == 0) {
                if (digit == 0) {
                    count++;
                }
                continue;
            }
            while(num>0){
                if(num%10 == digit) count++;
                num=num/10;
            }     
        }
        return count;
    }
}