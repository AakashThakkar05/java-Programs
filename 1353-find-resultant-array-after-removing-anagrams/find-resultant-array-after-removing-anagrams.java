class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();

        // First word hamesha add hoga
        result.add(words[0]);

        // Previous word ka frequency signature
        int[] prevFreq = getFreq(words[0]);

        for (int i = 1; i < words.length; i++) {

            int[] currFreq = getFreq(words[i]);

            // Agar frequency arrays same nahi hain
            if (!Arrays.equals(prevFreq, currFreq)) {
                result.add(words[i]);
                prevFreq = currFreq; // update previous
            }
        }

        return result;
    }

    // Helper function: frequency array banata hai
    private int[] getFreq(String word) {
        int[] freq = new int[26];
        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        return freq;
    }
}