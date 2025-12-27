class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int size = password.length();
         boolean u = false, l = false, d = false,sp = false;
        if(size >= 8){
        for(int i = 0;i < size;i++){
            int ch = password.charAt(i);
            if((i+1) < size && ch == password.charAt(i+1)) return false;
            else if(Character.isUpperCase(ch)) u = true;
            else if(Character.isLowerCase(ch)) l = true;
            else if(Character.isDigit(ch)) d = true;
            else sp = true; 
        }
    }
        if(u && l && d && sp) return true;
        return false;
    }
}