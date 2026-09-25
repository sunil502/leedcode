class Solution {
    // private boolean canFinish(int[] piles,int speed,int h){
    //     long hours=0;
    //     for(int pile:piles){
    //         hours += (pile+speed-1)/speed;

    //         if(hours>h) return false;
    //     }
    //     return hours<=h;
    // }

    private boolean canFinish(int[] piles,int mid,int h){
        long hours=0;
        for(int pile:piles){
            hours += (pile+mid-1)/mid;

            if(hours>h) return false;
        }
        return hours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        // int maxPile=0;
        // for(int pile:piles){
        //     maxPile=Math.max(maxPile,pile);
        // }
        // for(int speed=1;speed<=maxPile;speed++){
        //     if(canFinish(piles,speed,h)) return speed;
        // }
        // return maxPile;

        int low=1;
        int high=0;
        for(int pile:piles){
            high=Math.max(high,pile);
        }
        while(low<high){
            int mid=(low+high)/2;
            if(canFinish(piles,mid,h)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}