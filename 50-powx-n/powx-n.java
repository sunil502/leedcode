class Solution {
    public double myPow(double x, int n) {
       long power = n;

        if (power < 0) {
            power = -1*power;
        }

        double result = 1.0;

        while (power > 0) {
            if (power%2 == 1) {
                result *= x;
                power=power-1;
            }else{
                x *=x;
                power=power/2;
            }
        }
        if(n<0) result=(double)(1.0)/(double)(result);
        return result;
    }
}