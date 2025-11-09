import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());
        String[] string = in.readLine().split("");
        int count = 0;
        for (int i = 0; i < N; i++) {
            count += Integer.parseInt(string[i]);
        }

        System.out.println(count);
    }
}