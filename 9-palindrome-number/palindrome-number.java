class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        long rev = 0;
        int y = x;

        while (y > 0) {
            int lastdigit = y % 10;
            rev = rev * 10 + lastdigit;
            y /= 10;
        }
        return rev == x;
    }
}