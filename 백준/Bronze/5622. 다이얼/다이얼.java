import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split("");

//        String[] telphone = new String[8];
        int count = 0;
        String[] telphone = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
//        for (int i = 0; i < split.length; i++) {
        for (String s : split) {
            for (int j = 0; j < 8; j++) {
                if (telphone[j].contains(s)) {
                    count += (3 + j);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}