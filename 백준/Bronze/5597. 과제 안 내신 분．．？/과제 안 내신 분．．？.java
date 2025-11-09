import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] people = new int[31];
        for (int i = 1; i <= 28; i++) {
            int num = Integer.parseInt(in.readLine());
            people[num] = 1;
        }

        for (int i = 1; i < 31; i++) {
            if (people[i] == 0) {
                System.out.println(i);
            }
        }
    }
}