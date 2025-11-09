import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            String[] split = in.readLine().split(" ");
            int n = Integer.parseInt(split[0]);
            String s = split[1];

            for (int j = 0; j < s.length(); j++) {
                for (int m=0; m<n; m++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}