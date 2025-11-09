import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();
        int n = Integer.parseInt(in.readLine());

        System.out.println(string.charAt(n-1));
    }
}