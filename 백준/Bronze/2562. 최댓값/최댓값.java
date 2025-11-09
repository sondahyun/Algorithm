import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < 9; i++) {
            int N = Integer.parseInt(in.readLine());
            if (max < N) {
                max = N;
                index = i;
            }
        }

        System.out.println(max + "\n" + (index + 1));
    }
}