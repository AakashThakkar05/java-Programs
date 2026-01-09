class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        int sum = 0;
        map.put(0 , 1);
        for(int i : nums){
            sum += i;
            int diff = sum - k;
            if(map.containsKey(diff)){
                ans += map.get(diff);
            }
            map.put(sum , map.getOrDefault(sum , 0)+ 1);
        }
return ans;
        }
        
    }
