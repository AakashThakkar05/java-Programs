class Solution {
    public double recPow(double x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        double r = recPow(x,n/2);
        return (n % 2 == 0) ? r * r : r * r * x;
    }
    public double myPow(double x, int n){
        boolean isNeg = false;
        if(n < 0){
            isNeg = true;
            n *= -1;
        }
        double ans = recPow(x,n);
        return isNeg ? 1/ans : ans;
    
    }
}