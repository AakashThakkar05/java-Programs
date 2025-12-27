class Solution {
    public int percentageLetter(String s, char letter) {
        int c = 0;
        int perc = 0;
        for(char ch : s.toCharArray()){
            if(ch == letter){
                c++;
            }
        }
        perc = ((c*100)/s.length());
        return perc;
    }
}