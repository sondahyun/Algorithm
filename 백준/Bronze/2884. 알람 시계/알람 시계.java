import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);

        if ( B >= 45) {
            System.out.println(A + " " + (B-45));
        } else {
            if (A >= 1) {
                System.out.println((A - 1) + " " + (60 - 45 + B));
            } else {
                System.out.println((24 - 1 + A) + " " + (60 - 45 + B));
            }
        }

    }
}