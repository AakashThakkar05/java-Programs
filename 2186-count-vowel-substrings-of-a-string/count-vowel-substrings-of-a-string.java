class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        int n = word.length();

        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {

                char ch = word.charAt(j);
                // consonant mila to break
                if (!isVowel(ch)) {
                    break;
                }
                // vowel ko set me daalo
                set.add(ch);
                // agar 5 vowels mil gaye
                if (set.size() == 5) {
                    count++;
                }
            }
        }
        return count;
    }
    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}