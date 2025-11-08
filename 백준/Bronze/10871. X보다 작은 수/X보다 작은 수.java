import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int N;
    public static int X;
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");

        N = Integer.parseInt(split[0]);
        X = Integer.parseInt(split[1]);

        String[] A = in.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(A[i]);
            if (a < X) {
                System.out.print(a + " ");
            }
        }

    }
}