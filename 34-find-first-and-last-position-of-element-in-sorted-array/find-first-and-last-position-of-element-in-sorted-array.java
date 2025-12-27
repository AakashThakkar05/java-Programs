class Solution {
    public int solve(int nums[] ,int start ,int end ,boolean isStarting ,int target){
        int ans = -1;
        while(start <= end){
            int mid = (start + (end - start) / 2);
            if(nums[mid] == target){
                ans =mid;
                if(isStarting) end = mid - 1;
                else start = mid + 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] temp = new int[2];
        temp[0] = solve(nums,0,nums.length-1,true,target);
        temp[1] = solve(nums,0,nums.length-1,false,target);
        return temp;
    }
}