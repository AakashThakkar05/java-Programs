class Solution {
    public String largestGoodInteger(String num) {
        int n = num.length();
        String best = "";

        for(int i = 0;i + 2 < n; i++){
            int first = num.charAt(i);
            int second = num.charAt(i+1);
            int third = num.charAt(i+2);

            if(first == second && first == third){
                String current = num.substring(i , i + 3);

                if(current.compareTo(best) > 0){
                    best = current;
                }
            }
        }
        return best;
    }
}