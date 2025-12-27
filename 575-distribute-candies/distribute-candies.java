import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {

        // HashSet duplicate allow nahi karta
        Set<Integer> set = new HashSet<>();

        // Unique candy types add karo
        for (int candy : candyType) {
            set.add(candy);
        }
        int maxCandy = candyType.length / 2;
        return Math.min(set.size(), maxCandy);
    }
}
