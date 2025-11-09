import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] split = in.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        int[] box = new int[N];

        for (int i = 0; i < M; i++) {
            String[] split1 = in.readLine().split(" ");
            for (int j = Integer.parseInt(split1[0])-1; j <= Integer.parseInt(split1[1])-1; j++) {
                box[j] = Integer.parseInt(split1[2]);
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(box[i] + " ");
        }
    }
}