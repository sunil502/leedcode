class Solution {
    public int minAddToMakeValid(String s) {
        int openCnt=0;
        int closeCnt=0;

        for(char ch:s.toCharArray()){
            if(ch == '('){
                openCnt++;
            }else if(openCnt > 0){
                openCnt--;
            }else{
                closeCnt++;
            }
        }

        return openCnt + closeCnt;
    }
}