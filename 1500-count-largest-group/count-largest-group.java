class Solution {
    
    private int sum(int n){
        int sum=0;
        while(n>0){
            sum += n%10;
            n /=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        int ans=0;
        for(int i=1;i<=n;i++){
            int sum=sum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
            if(max<map.get(sum)){
                max=map.get(sum);
                ans=1;
            }else if(max==map.get(sum)){
                ans += 1;
            }
        }
        return ans;
    }
}