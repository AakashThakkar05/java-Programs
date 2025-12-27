class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxC = 0, count = 0;
        for(int a : nums){
            if(a == 0){
                maxC = Math.max(maxC,count);
                count = 0;
            }else{
                count++;
            }
        }
        return Math.max(maxC,count);
    }
}