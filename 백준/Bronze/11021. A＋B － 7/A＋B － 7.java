import java.io.BufferedReader;
import java.io.InputStreamReader;

// 종료 조건이 없을 때
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());

        for (int i = 1; i <= T; i++) {
            String[] split = in.readLine().split(" ");
            int A = Integer.parseInt(split[0]);
            int B = Integer.parseInt(split[1]);
            int count = A + B;
            System.out.println("Case #"+i+ ": " + (A+B));
        }

    }
}