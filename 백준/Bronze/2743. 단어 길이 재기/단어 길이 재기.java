import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String string = in.readLine();

        System.out.println(string.length());
    }
}