import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String split = in.readLine().trim(); // 공백 제거
        if (split.isEmpty()) {
            System.out.println(0);
        } else {
            String[] line = split.split(" ");
            System.out.println(line.length);
        }
    }
}