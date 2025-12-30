class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int first = 1, last = 0 , ans = -1;

        for(int i : piles){
            last = Math.max(last,i);
        }

        while(first <= last){
            int mid = first + (last - first) / 2;
            if(isValid(piles,h,mid)){
                ans = mid;
                last = mid - 1;
            }else{
                first = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isValid(int[] arr, int h, int k){
        long total = 0;
        for(int i : arr){
            if(i % k == 0){
                total += i / k;
            }else{
                total += (i / k) + 1;
            }
        }
        if(total > h) return false;
        return true;
    }
}