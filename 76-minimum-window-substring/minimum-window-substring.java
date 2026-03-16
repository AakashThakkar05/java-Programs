class Solution {
    public String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0) return "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int i = 0, j = 0, count = 0, minS = 0;
        int minL = Integer.MAX_VALUE;
        while(j < s.length()){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
            map.put(ch,map.get(ch) - 1);
            if(map.get(ch) >= 0) count++;
        }
        while(count == t.length()){
            if(j - i + 1 < minL){
                minL = j - i + 1;
                minS = i;
            }
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c) + 1);
                if(map.get(c) > 0) count--; 
            }
            i++;
        }
        j++;
    }
    if(minL == Integer.MAX_VALUE) 
    return "";
    return s.substring(minS, minS + minL);
    }
}