class Solution {
    public int heightChecker(int[] heights) {
        int n= heights.length;
        int count=0;
        int[] ans=heights.clone();
        Arrays.sort(ans);
        for(int i=0;i<n;i++){
            if(heights[i]!=ans[i]){
                count++;
            }
        }
        return count;
    }
}