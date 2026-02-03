class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void backtrack(int i, int[] nums, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int x : nums) temp.add(x);
            res.add(temp);
            return;
        }

        Set<Integer> seen = new HashSet<>();

        for (int j = i; j < nums.length; j++) {
            if (seen.contains(nums[j])) continue;
            seen.add(nums[j]);
            swap(nums, i, j);
            backtrack(i + 1, nums, res);
            swap(nums, i, j);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res);
        return res;
    }
}

