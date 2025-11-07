import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int bulgi = Integer.parseInt(in.readLine());
        System.out.println(bulgi - 543);

    }
}