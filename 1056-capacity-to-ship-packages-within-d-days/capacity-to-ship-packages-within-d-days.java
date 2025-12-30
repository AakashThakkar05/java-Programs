class Solution {
    public boolean isValid(int arr[], int upper, int k){
        int sum =0, count = 1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i]>upper){
                count++;
                sum = arr[i];
            }else sum+= arr[i];
        }
        return count<=k;
    }
    public int shipWithinDays(int[] weights, int days) {
        // code here
        if(days > weights.length) return -1;
        int first = Integer.MIN_VALUE , last = 0, ans =-1;
        for(int i = 0; i < weights.length; i++){
            last += weights[i];
            first = Math.max(first , weights[i]);
        }
        while(first<=last){
            int mid = first + (last-first)/2;
            if(isValid(weights,mid,days)){
                ans = mid;
                last = mid-1;
            }else first = mid+1;
        }
        return ans;
    }
}