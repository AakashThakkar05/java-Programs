class Solution {
    public int fib(int n) {
        if(n <= 1) return n;
        int sum = 0;
        int firstNum = 0;
        int secondNum = 1;
        for(int i = 2; i <= n; i++){
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        return sum;
    }
}