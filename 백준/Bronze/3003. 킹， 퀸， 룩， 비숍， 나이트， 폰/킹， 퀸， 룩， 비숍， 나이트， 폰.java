import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split(" ");
        int[] array = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            System.out.print(array[i] - Integer.parseInt(split[i]) + " ");
        }

    }
}