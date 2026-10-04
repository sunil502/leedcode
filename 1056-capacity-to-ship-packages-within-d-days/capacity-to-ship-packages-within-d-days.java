class Solution {
    // private int daysNeeded(int[] weights,int capacity){
    //     int days=1;
    //     int currentLoad=0;
    //     for(int weight:weights){
    //         if(currentLoad+weight >capacity){
    //             days++;
    //             currentLoad=weight;
    //         }else{
    //             currentLoad+=weight;
    //         }
    //     }
    //     return days;
    // }

    private boolean canShip(int[] weights,int days,int mid){
        int usedDays=1;
        int currentLoad=0;
        for(int weight:weights){
            if(currentLoad+weight > mid){
                usedDays++;
                currentLoad=weight;
            }else{
                currentLoad+=weight;
            }
        }
        return usedDays <= days;
    }

    public int shipWithinDays(int[] weights, int days) {
        // int minCapacity=0;
        // int maxCapacity=0;
        // for(int weight:weights){
        //     minCapacity=Math.max(weight,minCapacity);
        //     maxCapacity += weight;
        // }

        // for(int capacity=minCapacity;capacity<=maxCapacity;capacity++){
        //     if(daysNeeded(weights,capacity)<=days){
        //         return capacity;
        //     }
        // }
        // return -1;


        int low=0;
        int high=0;
        for(int weight:weights){
            low=Math.max(weight,low);
            high += weight;
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canShip(weights,days,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}