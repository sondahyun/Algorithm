import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(in.readLine());
        int test_case = Integer.parseInt(in.readLine());
        int count = 0;

        for (int i = 1; i <= test_case; i++) {
            String[] split = in.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            count += A * B;
        }
        if (count == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}