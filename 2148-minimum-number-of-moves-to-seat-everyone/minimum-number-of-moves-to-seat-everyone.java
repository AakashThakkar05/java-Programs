class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int move = 0;

        for(int i = 0; i < seats.length; i++){
            int abs = Math.abs(seats[i]-students[i]);
            move = move + abs;
        }
        return move;
    }
}