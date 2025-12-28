class Solution {
    public void sortColors(int[] nums) {
        int s = 0, m = 0, e = nums.length-1;
        while(e >= m){
            if(nums[m] == 0){
                int temp = nums[m];
                nums[m] = nums[s];
                nums[s] = temp;
                m++;
                s++;
            }else if(nums[m] == 2){
                int temp = nums[e];
                nums[e] = nums[m];
                nums[m]= temp;
                e--;
            }else{
                m++;
            }
        }
    }
}