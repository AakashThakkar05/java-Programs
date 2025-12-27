class Solution {
    public int minMaxGame(int[] nums) {
        int n = nums.length;

        if(n == 1)
            return nums[0];
        int i = 0, j = 1;
        int[] newNums = new int [n/2];
        int index = 0;
        while (j < n){
            if(index % 2 == 0){
                newNums[index] = Math.min(nums[i] , nums[j]);
            }else{
                newNums[index] = Math.max(nums[i] , nums[j]);
            }
            index++;
            i+=2;
            j+=2;
        }
         
        return minMaxGame(newNums);       
    }
}