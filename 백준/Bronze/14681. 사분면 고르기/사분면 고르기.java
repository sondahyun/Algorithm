import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(in.readLine());
        int B = Integer.parseInt(in.readLine());
        
        if (A > 0 && B > 0) {
            System.out.println(1);
        } else if (A > 0 && B < 0) {
            System.out.println(4);
        } else if (A < 0 && B > 0) {
            System.out.println(2);
        } else {
            System.out.println(3);
        }
        

    }

}