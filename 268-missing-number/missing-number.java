class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            int cInd = nums[i];

            if(nums[i] < n && nums[i]!= nums[cInd]){
                int temp = nums[cInd];
                nums[cInd] = nums[i];
                nums[i] = temp;
            }else
                i++;
        }
        for(int j = 0; j < n;j++){
            if(j != nums[j]) 
                return j;
        }
        return n;
    }
}