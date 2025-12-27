class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1){
            return word;
        }
        String left = word.substring(0 , index + 1);
        String right = word.substring(index + 1);
        String revleft = new StringBuilder(left).reverse().toString();
        String result = revleft + right;
        return result;
    }
}