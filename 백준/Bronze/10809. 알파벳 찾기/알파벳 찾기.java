import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        int[] array = new int[26];
        Arrays.fill(array, -1);
//        System.out.println((int)'a');
//        System.out.println((int)'z');
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 97 & s.charAt(i) <= 122) {
                if (array[s.charAt(i) - 97] != -1) {
                    continue;
                }
                array[s.charAt(i) - 97] = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(array[i] + " ");
        }
    }
}