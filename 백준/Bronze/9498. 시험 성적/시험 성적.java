import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(in.readLine());

        if (A >= 90 && A <= 100) {
            System.out.println("A");
        } else if (A >= 80 && A <= 89) {
            System.out.println("B");
        } else if (A >= 70 && A <= 79) {
            System.out.println("C");
        } else if (A >= 60 && A <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}