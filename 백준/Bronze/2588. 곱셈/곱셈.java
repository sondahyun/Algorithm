import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());

        int b1 = b / 100;
        int b2 = b / 10 % 10;
        int b3 = b % 10;

        System.out.println(a * b3);
        System.out.println(a * b2);
        System.out.println(a * b1);
        System.out.println(a * b);
    }
}