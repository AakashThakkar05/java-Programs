class Solution {
    public int longestConsecutive(int[] nums) {
        long max = 0;
        Set<Integer> set = new HashSet<>();

        for(int a : nums){ 
            set.add(a);
        }
        for(int i : set){
            if(set.contains(i-1)){
                continue;
            }
            long curr = 1;
            while(set.contains(++i)){
                curr++;
            }
            max =Math.max(max, curr);
        }
        return (int)max;
    }
}