import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split(" ");

        long A = Long.parseLong(split[0]);
        long B = Long.parseLong(split[1]);
        long C = Long.parseLong(split[2]);

        System.out.println(A+B+C);
    }
}