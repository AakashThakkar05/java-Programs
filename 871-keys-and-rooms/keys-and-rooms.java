class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visit = new boolean[rooms.size()];
        dfs(rooms, visit, 0);

        for (boolean v : visit) {
            if (!v) return false;
        }
        return true;
    }

    public void dfs(List<List<Integer>> rooms, boolean[] visit, int room) {
        visit[room] = true;

        for (int key : rooms.get(room)) {
            if (!visit[key]) {
                dfs(rooms, visit, key);
            }
        }
    }
}