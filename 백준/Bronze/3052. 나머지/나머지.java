import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] people = new int[43];
        for (int i = 1; i <= 10; i++) {
            int num = Integer.parseInt(in.readLine()) % 42;
            people[num] = 1;
        }

        int count = 0;
        for (int i = 0; i < 42; i++) {
            if (people[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}