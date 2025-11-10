import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split(" ");

        String num1 = split[0];
        String num2 = split[1];

        String new_num1 = num1.substring(2, 3) + num1.substring(1,2) + num1.substring(0,1);
        String new_num2 = num2.substring(2, 3) + num2.substring(1,2) + num2.substring(0,1);

        if (Integer.parseInt(new_num1) > Integer.parseInt(new_num2)) {
            System.out.println(new_num1);
        } else {
            System.out.println(new_num2);
        }


    }
}