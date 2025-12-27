class Solution {
    public int search(int[] nums, int target) {
        int first = 0;
        int end = nums.length-1;
        while(first <= end){
            int mid = (first + (end - first) / 2);
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                first = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}