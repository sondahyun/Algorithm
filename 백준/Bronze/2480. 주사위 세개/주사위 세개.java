import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");

        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int C = Integer.parseInt(split[2]);

        if (A == B && B == C) {
            System.out.println(10000 + A * 1000);
        } else if (A == B || B == C || C == A) {
            if (A == B) {
                System.out.println(1000 + A * 100);
            } else if (A == C) {
                System.out.println(1000 + A * 100);
            } else if (B == C) {
                System.out.println(1000 + B * 100);
            }
        } else {
            if (A > B) {
                if (C > A) {
                    System.out.println(C * 100);
                } else {
                    System.out.println(A * 100);
                }
            } else if (A < B) {
                if (C > B) {
                    System.out.println(C * 100);
                } else {
                    System.out.println(B * 100);
                }
            }
        }

    }
}