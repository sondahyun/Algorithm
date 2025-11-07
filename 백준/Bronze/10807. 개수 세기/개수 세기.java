import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        String[] split = in.readLine().split(" ");
        int F = Integer.parseInt(in.readLine());
        int count = 0;

        int[] array = new int[T];
        for (int i = 0; i < T; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        for (int i = 0; i < T; i++) {
            if (array[i] == F) {
                count++;
            }
        }

        System.out.println(count);

    }
}