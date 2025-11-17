import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[][] A;
    public static int[][] B;
    public static int[][] C;
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());
        
        System.out.println(A*B);
    }
}