class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 7 == 0) {
            return n/7;
        }
        return n/7 + 1;
    }
}