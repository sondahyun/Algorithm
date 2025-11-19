import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int A;
    public static int B;
    public static int C;
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());
        int C = Integer.parseInt(in.readLine());

        if (A == 60 && B == 60 && C ==60) {
            System.out.println("Equilateral");
        } else if (A + B + C == 180 && (A == B || B == C || C == A)) {
            System.out.println("Isosceles");
        } else if (A + B + C == 180 && (A != B && B != C && C != A)) {
            System.out.println("Scalene");
        } else if (A + B + C != 180) {
            System.out.println("Error");
        }
    }
}