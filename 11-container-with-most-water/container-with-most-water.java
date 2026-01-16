class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        int currArea = 0;
        while(left < right){
            currArea = Math.min(height[left], height[right]) * (right-left);
            max = Math.max(currArea, max);

            if(height[left] > height[right]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }
}