class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] array1 = new int[1001];
        for(int i : nums1){
            array1[i]++;
        }
        for(int j : nums2){
            if(array1[j] != 0){
            ans.add(j);
            array1[j]--;
            }
        }
        int[] fin = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++){
            fin[k] = ans.get(k);
        }
        return fin;
    }
}