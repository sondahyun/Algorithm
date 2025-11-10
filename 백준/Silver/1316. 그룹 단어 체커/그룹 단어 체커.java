import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            int[] array = new int[123];
            Arrays.fill(array, 0);
            String s = in.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (array[s.charAt(j)] == 1) {
                    break;
                }
                array[s.charAt(j)] = 1;
                while (j + 1 != s.length() && s.charAt(j + 1) == s.charAt(j)) {
                    j++;
                }
                if (j == s.length() - 1) {
                    count++;
                }
            }

        }
        System.out.println(count);

    }
}