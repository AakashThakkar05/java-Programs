class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] freq = new int[100002]; // constraint ke hisaab se
        int maxFreq = 0;
        int ans = -1;

        // Step 1: count frequency of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                freq[num]++;
            }
        }

        // Step 2: find most frequent even
        for (int num : nums) {
            if (num % 2 == 0) {
                if (freq[num] > maxFreq) {
                    maxFreq = freq[num];
                    ans = num;
                } 
                // tie case → smaller even number
                else if (freq[num] == maxFreq && num < ans) {
                    ans = num;
                }
            }
        }

        return ans;
    }
}