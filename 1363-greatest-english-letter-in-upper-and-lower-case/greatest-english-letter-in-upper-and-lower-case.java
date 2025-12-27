class Solution {
    public String greatestLetter(String s) {
        boolean[] lowercase = new boolean[26];
        boolean[] uppercase = new boolean[26];

        for(char ch : s.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                lowercase[ch - 'a'] = true;
            }
            if(ch >= 'A' && ch <= 'Z'){
                uppercase[ch - 'A'] = true;
            }
        }
            for(int i = 25 ; i >= 0; i--){
                if(lowercase[i] && uppercase[i]){
                    return String.valueOf((char) ('A' + i));
                }
            }
        
        return "";
    }
}