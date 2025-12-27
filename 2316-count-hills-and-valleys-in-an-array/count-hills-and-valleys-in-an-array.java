class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int last = nums[0];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
            if(last < nums[i] && nums[i+1] < nums[i] || last > nums[i] && nums[i+1] > nums[i])
            count++;
            last = nums[i];
            }
        }
        return count;
    }
}


