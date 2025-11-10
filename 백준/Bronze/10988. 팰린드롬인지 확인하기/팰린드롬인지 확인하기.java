import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split("");
        int flag = 1; // 길이가 1일때를 대비해야함

        for (int i = 0; i < split.length / 2; i++) {
            if (split[i].equals(split[split.length-i-1])) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
        }
        System.out.println(flag);
    }
}