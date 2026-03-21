class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visit = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        int s = 0;
        q.offer(s);
        while(!q.isEmpty()){
            int temp = q.poll();
            visit[temp] = true;
            ans.add(temp);
            for(int i = 0; i < rooms.get(temp).size(); i++){
                int neig = rooms.get(temp).get(i);
                if(!visit[neig]){
                    q.offer(neig);
                    visit[neig] = true;
                    q.offer(neig);
                }
            }
        }
        for(boolean b : visit){
            if(!b){
                return false;
            }
        }
         return true;
    }
}