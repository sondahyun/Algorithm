import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        String[] split = in.readLine().split(" ");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(split[i]);
            if (max < a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
        }

        System.out.println(min + " " + max);
    }
}