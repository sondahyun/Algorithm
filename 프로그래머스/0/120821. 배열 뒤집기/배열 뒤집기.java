class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 1;
        for (int i : num_list) {
            answer[num_list.length - j] = i;
            j++;
        }
        return answer;
    }
}