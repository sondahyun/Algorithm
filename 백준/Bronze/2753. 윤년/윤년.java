import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(in.readLine());

        if (A % 4 == 0 && (A % 100 != 0 || A % 400 == 0)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}