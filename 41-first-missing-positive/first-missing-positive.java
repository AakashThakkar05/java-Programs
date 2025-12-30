class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        int n = nums.length;
        
        while(i < n){
            int cp = nums[i]-1;

            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[cp]){
                int temp = nums[i];
                nums[i] = nums[cp];
                nums[cp] = temp;
            }
            else i++;
        }
        int count = 1;
        for(int j = 0; j < n; j++){
            if(nums[j] != count){
                return count;
            }
            count++;
        }
        return count++;
    }
}