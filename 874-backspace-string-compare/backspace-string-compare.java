class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> fs = new Stack<>();
        Stack<Character> ft = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '#' && !fs.isEmpty()){
                fs.pop();
            }else{
                if(ch != '#'){
                    fs.push(ch);
                }
            }
        }
        for(char ch : t.toCharArray()){
            if(ch == '#' && !ft.isEmpty()){
                ft.pop();
            }else{
                if(ch != '#'){
                    ft.push(ch);
                }
            }
        }
        if(fs.size() != ft.size()){
            return false;
        }else{
            while(!fs.isEmpty() && !ft.isEmpty()){
                if(fs.pop() != ft.pop()){
                    return false;
                }
            }
        }
        return true;
    }
}