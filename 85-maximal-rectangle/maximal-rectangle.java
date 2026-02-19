class Solution {
    public static int solve(int[] heights) {
        Stack <Integer> stack1 = new Stack<>();
        Stack <Integer> stack2 = new Stack<>();

        int left[] = new int[heights.length];
        int right[] = new int[heights.length];
        
        // left
        for(int i = 0; i < heights.length; i++){
            while(!stack1.isEmpty() && heights[stack1.peek()] >= heights[i]) stack1.pop();
            if(stack1.isEmpty()){
                left[i] = -1;
            }else{
                left[i] = stack1.peek();
            }
            stack1.push(i);
        }
        // right
        for(int i = heights.length-1; i >= 0 ; i--){
            while(!stack2.isEmpty() && heights[stack2.peek()] >= heights[i]) stack2.pop();
            if(stack2.isEmpty()){
                right[i] = heights.length;
            }else{
                right[i] = stack2.peek();
            }
            stack2.push(i);
        }
        int max = 0;
        for(int i = 0; i < heights.length; i++){
            int area = heights[i] * (right[i] - left[i] -1);
            max = Math.max(max, area);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix){
        int maxA = 0;
        int heights[] = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == '1'){
                    heights[j]++;
                }else{
                    heights[j] = 0;
                }
            }
            maxA = Math.max(maxA, solve(heights));
        }
        return maxA;
    }
}