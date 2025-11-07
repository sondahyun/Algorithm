import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");
        int X = Integer.parseInt(split[0]);
        int Y = Integer.parseInt(split[1]);

        int T = Integer.parseInt(in.readLine());


        X = (X + (Y + T) / 60) % 24;
        Y = (Y + T) % 60;

        System.out.println(X + " " + Y);
    }
}