import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
           count += i;
        }

        System.out.println(count);
    }
}