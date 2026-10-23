class Solution {
    public int findNumbers(int[] nums) {
        // int ans=0;
        // for(int num:nums){
        //     int count=0;
        //     int digit=0;
        //     int temp=num;
        //     while(temp>0){
        //         digit=temp%10;
        //         count++;
        //         temp /=10;
        //     }
        //     if(count%2==0) ans++;
        // }
        // return ans;

        // int ans=0;
        // for(int i:nums){
        //     if((i>9 && i<100) || (i>999 && i<10000) || i==100000) ans++;
        // }
        // return ans;

        int ans=0;
        for(int num:nums){
            int digit=(int) Math.log10(num)+1;
            if(digit%2==0) ans++;
        }
        return ans;
    }
}