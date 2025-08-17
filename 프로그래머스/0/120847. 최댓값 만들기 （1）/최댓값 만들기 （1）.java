import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers); // 오름차순 정렬 -> void
        
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}