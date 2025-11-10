import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(n-i-2)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}