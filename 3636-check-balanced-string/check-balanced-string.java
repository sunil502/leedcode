class Solution {
    public boolean isBalanced(String num) {
        int n=num.length();
        int evenSum=0;
        int oddSum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                evenSum += num.charAt(i)-'0';
            }else{
                oddSum += num.charAt(i)-'0';
            }
        }
        return evenSum == oddSum;
    }
}