class Solution {
    public boolean checkDistances(String s, int[] distance) {

        int[] firstIndex = new int[26];

        // Initialize all positions as -1
        for (int i = 0; i < 26; i++) {
            firstIndex[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';

            if (firstIndex[ch] == -1) {
                // First occurrence
                firstIndex[ch] = i;
            } else {
                // Second occurrence
                int actualDistance = i - firstIndex[ch] - 1;
                if (actualDistance != distance[ch]) {
                    return false;
                }
            }
        }
        return true;
    }
}