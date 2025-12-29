class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int corrPos = nums[i] - 1;

            if(nums[corrPos]!=nums[i]){
                int temp = nums[corrPos];
                nums[corrPos] = nums[i];
                nums[i] = temp;
            }else
                i++;
        }
        for(int j = 0; j < nums.length ; j++){
            if(j + 1 != nums[j]){
                list.add(j+1);
            }
        }
        return list;
    }
}