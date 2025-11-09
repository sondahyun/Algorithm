import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        double[] array = new double[n];
        String[] split = in.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int index = -1;
        Double sum = 0.0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(split[i]);
            if (num > max) {
                max = num;
                index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            array[i] = Double.parseDouble(split[i])/max*100;
        }
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        System.out.println(sum/n);


    }
}