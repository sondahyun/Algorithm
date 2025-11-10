import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String[] split = in.readLine().split("");
        int[] array = new int[123];
        Arrays.fill(array,0);
        for (int i = 0; i < split.length; i++) {
            array[Character.toLowerCase(split[i].charAt(0))] += 1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 97; i <= 122; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int flag = 0;
        int index = -1;
        for (int i = 97; i <= 122; i++) {
            if (array[i] == max) {
                if (flag == 0) {
                    flag = 1;
                    index = i;
                } else {
                    System.out.println("?");
                    return;
                }
            }
        }
        System.out.println(Character.toUpperCase((char)index));

    }
}