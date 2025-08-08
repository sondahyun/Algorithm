class Solution {
    public Object solution(int n) {
        int answer = 0;
        char[] n_string = String.valueOf(n).toCharArray();
        
        for (int i = 0; i < n_string.length; i++) {
            answer += n_string[i] - '0';
        }
        return answer;
    }
}