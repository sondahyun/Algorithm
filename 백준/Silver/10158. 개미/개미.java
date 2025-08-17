import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	StringBuilder sb = new StringBuilder();
	public static int w;
	public static int h;
	public static int p;
	public static int q;
	public static int t;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] split = in.readLine().split(" ");
		w = Integer.parseInt(split[0]);
		h = Integer.parseInt(split[1]);

		String[] split1 = in.readLine().split(" ");
		p = Integer.parseInt(split1[0]);
		q = Integer.parseInt(split1[1]);

		t = Integer.parseInt(in.readLine());


		
		// x 좌표 계산
        int x = (p + t) % (2 * w);
        if (x > w) x = 2 * w - x;

        // y 좌표 계산
        int y = (q + t) % (2 * h);
        if (y > h) y = 2 * h - y;

        System.out.println(x + " " + y);
	}

}