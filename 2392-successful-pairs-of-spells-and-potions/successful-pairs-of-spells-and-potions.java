class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        // int n=spells.length;
        // int m=potions.length;
        // int[] ans=new int[n];
        
        // for(int i=0;i<n;i++){
        //     int count=0;
        //     for(int j=0;j<m;j++){
        //         if((long)spells[i]*potions[j] >=success) {
        //             count++;
        //         }
        //     }
        //     ans[i]=count;
        // }
        // return ans;
        

        int n=spells.length;
        int m=potions.length;
        Arrays.sort(potions);
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            int low=0;
            int high=m;
            long req=(success+spells[i]-1)/spells[i];
            while(low<high){
                int mid=low+(high-low)/2;
                if(potions[mid]>=req){
                    high=mid;
                }else{
                    low=mid+1;
                }
            }
            ans[i]=m-low;
        }
        return ans;
    }
}