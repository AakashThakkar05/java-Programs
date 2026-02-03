class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void permute(int[] nums, List<List<Integer>> ans, int i) {
        if(i == nums.length){
            List<Integer> cur = new ArrayList<>();
            for(int a : nums) cur.add(a);
            ans.add(cur);
            return;
        }
        for(int j = i; j < nums.length; j++){
            swap(nums, i , j);
            permute(nums, ans, i+1);
            swap(nums, i, j);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permute(nums, ans, 0);
        return ans;
    }
}