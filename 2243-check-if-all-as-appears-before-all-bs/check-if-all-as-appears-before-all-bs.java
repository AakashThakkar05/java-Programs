class Solution {
    public boolean checkString(String s) {
        int last = s.lastIndexOf('a');
        int first = s.indexOf('b');
        if(last<first || last == -1 || first == -1){
            return true;
        } 
        return false;
    }
}