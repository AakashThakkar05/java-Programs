class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivotIndex = randomPartition(nums, left, right);
            quickSort(nums, left, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, right);
        }
    }

    private int randomPartition(int[] nums, int left, int right) {
        int pivotIndex = left + (int)(Math.random() * (right - left + 1));
        swap(nums, left, pivotIndex);   // move random pivot to front
        return partition(nums, left, right);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            while (i <= j && nums[i] <= pivot) i++;
            while (i <= j && nums[j] > pivot) j--;

            if (i < j) {
                swap(nums, i, j);
            }
        }

        swap(nums, left, j);
        return j;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
