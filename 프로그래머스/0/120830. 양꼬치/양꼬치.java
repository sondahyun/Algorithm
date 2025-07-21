class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int total = n*12000 + k*2000;
        return total - 2000 * (n/10);
    }
}